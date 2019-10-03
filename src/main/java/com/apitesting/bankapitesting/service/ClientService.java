package com.apitesting.bankapitesting.service;

import com.apitesting.bankapitesting.client.ClientClient;
import com.apitesting.bankapitesting.models.AddressModel;
import com.apitesting.bankapitesting.models.ClientGetResponseBody;
import com.apitesting.bankapitesting.models.ClientPostBody;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ClientService {
    ClientClient client = new ClientClient();


    public Response getAllClients() {
        return client.getClients();
    }

    public Response getClientById(int id) {
        return client.getClient(id);
    }

    public Response postClient(ClientPostBody clientGetResponseBody) {
        return client.postClient(clientGetResponseBody);
    }

    public Response deleteClient(int id) {
        return client.deleteClient(id);
    }

    public ClientPostBody generateNewClient(String name, String clientTypeId, boolean isActive, String street, String city, String country) {
        AddressModel address = new AddressModel().street(street).city( city).country(country);
        ClientPostBody client = new ClientPostBody().name(name).clientTypeId(clientTypeId).isActive(isActive).address(address);

        return client;
    }

    public int generateAndCreateClient(String name, String clientTypeId, Boolean isActive, String street, String city, String country) {
       return postClient(generateNewClient(name, clientTypeId, isActive, street, city, country)).getBody().as(ClientGetResponseBody.class).getId();

    }
}
