package com.apitesting.bankapitesting.client;
import com.apitesting.bankapitesting.client.DefaultClient;
import com.apitesting.bankapitesting.models.AccountModel;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class AccountClient extends DefaultClient{
    DefaultClient defaultClient = new DefaultClient();

    public Response getAccounts(){
        return defaultClient.getRequest("http://localhost:55597/api","accounts");
    }

    public Response getAccount(int id){
        return defaultClient.getByIdRequest(id,"http://localhost:55597/api","accounts");
    }

    public Response postAccount(AccountModel account){
        return defaultClient.postRequest(account,"http://localhost:55597/api","Accounts");
    }

    public Response updateAccount(int id, AccountModel accountUpdated){
        return defaultClient.updateRequest(id,accountUpdated,"http://localhost:55597/api","Accounts");
    }

    public Response deleteAccount(int id){
        return defaultClient.deleteRequest(id,"http://localhost:55597/api","Accounts");
    }



}
