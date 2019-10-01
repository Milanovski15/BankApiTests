package com.apitesting.bankapitesting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientPostBody {
    @JsonProperty
    private String name, clientTypeId, clientTypeName;
    @JsonProperty
    private boolean isActive;
    @JsonProperty
    private AddressModel address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(String clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public String getClientTypeName() {
        return clientTypeName;
    }

    public void setClientTypeName(String clientTypeName) {
        this.clientTypeName = clientTypeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public ClientPostBody name(String name) {
        this.name = name;
        return this;
    }

    public ClientPostBody isActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public ClientPostBody clientTypeId(String clientTypeId) {
        this.clientTypeId = clientTypeId;
        return this;
    }

    public ClientPostBody clientTypeName(String clientTypeName) {
        this.clientTypeName = clientTypeName;
        return this;
    }

    public ClientPostBody address(AddressModel address) {
        this.address = address;
        return this;
    }
}
