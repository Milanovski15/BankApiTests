package com.apitesting.bankapitesting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressModel {
    @JsonProperty
    String street, city, country;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    //City
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    //Country
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressModel street(String street) {
        this.street = street;
        return this;
    }

    public AddressModel city(String city) {
        this.city = city;
        return this;
    }

    public AddressModel country(String country) {
        this.country = country;
        return this;
    }
}
