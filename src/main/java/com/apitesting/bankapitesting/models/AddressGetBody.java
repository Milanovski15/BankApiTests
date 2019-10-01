package com.apitesting.bankapitesting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressGetBody {
    @JsonProperty
    String Street, City, Country,Id;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        this.Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
