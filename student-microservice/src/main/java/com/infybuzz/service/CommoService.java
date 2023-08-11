package com.infybuzz.service;

import com.infybuzz.feignclients.AddressFeignClient;
import com.infybuzz.response.AddressResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommoService {

    Logger logger = LoggerFactory.getLogger(CommoService.class);
    long count = 1;

    @Autowired
    AddressFeignClient addressFeignClient;
    @CircuitBreaker(name = "addressService",
            fallbackMethod = "fallbackGetAddressById")
    public AddressResponse getAddressById (long addressId) {
        logger.info("count = " + count);
        count++;
        AddressResponse addressResponse =
                addressFeignClient.getById(addressId);
        return addressResponse;
    }

    public AddressResponse fallbackGetAddressById(long addressId, Throwable th) {
        logger.error("Error = " + th);
        return new AddressResponse();
    }
}
