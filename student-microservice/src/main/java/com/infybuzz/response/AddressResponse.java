package com.infybuzz.response;


public class AddressResponse {

    private long addressId;
    public String street;
    public String city;



    public long getAddressId() {
        return this.addressId;
    }
    public String getStreet() {
        return this.street;
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
