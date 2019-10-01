package com.apitesting.bankapitesting.service;

import com.apitesting.bankapitesting.client.AccountClient;
import com.apitesting.bankapitesting.models.AccountModel;
import io.restassured.response.Response;

public class AccountService {

    AccountClient client = new AccountClient();
    String url = "api/accounts/";

    public Response getAllAccounts(){
        return client.getAccounts();
    }

    public Response getAccountById(int id){
        return client.getAccount(id);
    }

    public Response postAccount(AccountModel account){
        return client.postAccount(account);
    }

    public Response updateAccount(int id, AccountModel account){
        return client.updateAccount(id,account);
    }

    public Response deleteAccount(int id){
        return client.deleteAccount(id);
    }

    public AccountModel generatePutAccountBody(int id, int clientId, int accountTypeId,String allowedDebt, boolean isActive){
        return new AccountModel()
                .id(id)
                .clientId(clientId)
                .accountTypeId(accountTypeId)
                .allowedDebt(allowedDebt)
                .balance("0")
                .isActive(isActive);

     }

    public AccountModel generateAccountBody(int clientId, int accountTypeId,String allowedDebt,String balance ,boolean isActive){
        return new AccountModel()
                .clientId(clientId)
                .accountTypeId(accountTypeId)
                .allowedDebt(allowedDebt)
                .balance("0")
                .isActive(isActive);
    }


}
