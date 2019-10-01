package com.apitesting.bankapitesting.client;

import com.apitesting.bankapitesting.models.ClientGetResponseBody;
import com.apitesting.bankapitesting.models.ClientPostBody;
import io.restassured.response.Response;

public class ClientClient {
    DefaultClient defaultClient = new DefaultClient();

    public Response getClients(){
        return defaultClient.getRequest("http://localhost:55597/api","Clients");
    }

    public Response getClient(int id){
        return defaultClient.getByIdRequest(id,"http://localhost:55597/api","Clients");
    }

    public Response postClient(ClientPostBody client){
        return defaultClient.postRequest(client,"http://localhost:55597/api","Clients");
    }

    //TODO: napravi update request

    public Response deleteClient(int id){
        return defaultClient.deleteRequest(id,"http://localhost:55597/api","Clients");
    }

}
