package com.infybuzz.request;


public class CreateAddressRequest {
    private String street;
    private String city;

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
}
