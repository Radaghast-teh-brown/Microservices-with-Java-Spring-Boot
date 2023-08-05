package com.infybuzz.response;

import com.infybuzz.entity.Address;

public class AddressResponse {

    private long addressId;
    public String street;
    public String city;

    public AddressResponse(Address address) {
        this.addressId = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();
    }


    public long getAddressId() {
        return this.addressId;
    }
    public String getStreet() {
        return this.city;
    }
    public String getCity() {
        return this.city;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddressId(long id) {
        this.addressId = id;
    }
}
