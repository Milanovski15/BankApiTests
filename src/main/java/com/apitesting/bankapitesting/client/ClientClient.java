package com.apitesting.bankapitesting.client;

import com.apitesting.bankapitesting.models.ClientPostBody;
import io.restassured.response.Response;

public class ClientClient {
    static String URL = "http://localhost:55597/api";
    static String PATH = "Clients";
    HttpRestClient httpRestClient = new HttpRestClient();

    public Response getClients(){
        return httpRestClient.getRequest(URL,PATH);
    }

    public Response getClient(int id){
        return httpRestClient.getByIdRequest(id,URL,PATH);
    }

    public Response postClient(ClientPostBody client){
        return httpRestClient.postRequest(client,URL,PATH);
    }

    //TODO: napravi update request

    public Response deleteClient(int id){
        return httpRestClient.deleteRequest(id,URL,PATH);
    }

}
