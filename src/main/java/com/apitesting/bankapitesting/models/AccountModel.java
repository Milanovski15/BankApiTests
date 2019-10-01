package com.apitesting.bankapitesting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountModel {

    @JsonProperty
    int Id;
    @JsonProperty
    int ClientId;
    @JsonProperty
    int AccountTypeId;
    @JsonProperty
    String ClientName, AccountTypeName, AllowedDebt, Balance;
    @JsonProperty
    boolean IsActive;

    //Id
    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    //ClientId
    public int getClientId() {
        return this.ClientId;
    }

    public void setClientId(int clientId) {
        this.ClientId = clientId;
    }

    //ClientName
    public String getClientName() {
        return this.ClientName;
    }

    public void setClientName(String clientName) {
        this.ClientName = clientName;
    }

    //AccountTypeId
    public int getAccountTypeId() {
        return this.AccountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.AccountTypeId = accountTypeId;
    }

    //AccountTypeName
    public String getAccountTypeName() {
        return this.AccountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.AccountTypeName = accountTypeName;
    }

    //AllowedDebt
    public String getAllowedDebt() {
        return this.AllowedDebt;
    }

    public void setAllowedDebt(String allowedDebt) {
        this.AllowedDebt = allowedDebt;
    }

    //Balance
    public String getBalance() {
        return this.Balance;
    }

    public void setBalance(String balance) {
        this.Balance = balance;
    }

    //IsActive
    public boolean getIsActive() {
        return this.IsActive;
    }

    public void setIsActive(boolean isActive) {
        this.IsActive = isActive;
    }

    public AccountModel id(int id) {
        this.Id = id;
        return this;
    }

    public AccountModel clientId(int clientId) {
        this.ClientId = clientId;
        return this;
    }

    public AccountModel accountTypeId(int accountTypeId) {
        this.AccountTypeId = accountTypeId;
        return this;
    }

    public AccountModel clientName(String clientName) {
        this.ClientName = clientName;
        return this;
    }

    public AccountModel accountTypeName(String accountTypeName) {
        this.AccountTypeName = accountTypeName;
        return this;
    }

    public AccountModel allowedDebt(String allowedDebt) {
        this.AllowedDebt = allowedDebt;
        return this;
    }

    public AccountModel balance(String balance) {
        this.Balance = balance;
        return this;
    }

    public AccountModel isActive(boolean isActive) {
        this.IsActive = isActive;
        return this;
    }
}
