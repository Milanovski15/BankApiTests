package com.apitesting.bankapitesting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientGetResponseBody {
    @JsonProperty
    int Id;
    @JsonProperty
    String Name, ClientTypeId, ClientTypeName;
    @JsonProperty
    boolean IsActive;
    @JsonProperty
    AddressGetBody Address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getClientTypeId() {
        return ClientTypeId;
    }

    public void setClientTypeId(String clientTypeId) {
        this.ClientTypeId = clientTypeId;
    }

    public String getClientTypeName() {
        return ClientTypeName;
    }

    public void setClientTypeName(String clientTypeName) {
        this.ClientTypeName = clientTypeName;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public AddressGetBody getAddress() {
        return Address;
    }

    public void setAddress(AddressGetBody address) {
        this.Address = address;
    }

    public ClientGetResponseBody name(String name) {
        this.Name = name;
        return this;
    }

    public ClientGetResponseBody clientTypeId(String clientTypeId) {
        this.ClientTypeId = clientTypeId;
        return this;
    }

    public ClientGetResponseBody isActive(boolean isActive) {
        this.IsActive = isActive;
        return this;
    }

    public ClientGetResponseBody address(AddressGetBody address) {
        this.Address = address;
        return this;
    }
}
