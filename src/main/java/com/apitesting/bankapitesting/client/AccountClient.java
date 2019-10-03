package com.apitesting.bankapitesting.client;
import com.apitesting.bankapitesting.models.AccountModel;
import io.restassured.response.Response;

import java.io.FileNotFoundException;

public class AccountClient extends HttpRestClient {
    static String URL = "http://localhost:55597/api";
    static String PATH = "Accounts";
    HttpRestClient httpRestClient = new HttpRestClient();

    public Response getAccounts(){
        return httpRestClient.getRequest(URL,PATH);
    }

    public Response getAccount(int id){
        return httpRestClient.getByIdRequest(id,URL,PATH);
    }

    public Response postAccount(AccountModel account){
        return httpRestClient.postRequest(account,URL,PATH);
    }

    public Response updateAccount(int id, AccountModel accountUpdated){
        return httpRestClient.updateRequest(id,accountUpdated,URL,PATH);
    }

    public Response deleteAccount(int id){
        return httpRestClient.deleteRequest(id,URL,PATH);
    }



}
