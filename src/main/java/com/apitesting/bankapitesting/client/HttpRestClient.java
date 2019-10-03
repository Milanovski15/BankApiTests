package com.apitesting.bankapitesting.client;

import com.apitesting.bankapitesting.models.AccountModel;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class HttpRestClient {

    public Response getRequest(String url, String path){
        RestAssured.baseURI = url;
        RequestSpecification requestSpec = RestAssured.given().log().all();
        Response response = requestSpec.request(Method.GET,"/"+path);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return response;
    }

    public Response getByIdRequest(int id, String url, String path){
        RestAssured.baseURI = url;
        RequestSpecification requestSpec = RestAssured.given().log().all();
        Response response = requestSpec.request(Method.GET,"/"+path+"/"+id);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return response;
    }

    public Response postRequest(Object object, String url, String path){
        RestAssured.baseURI = url;
        RequestSpecification requestSpec = RestAssured.given().log().all().body(object);
        requestSpec.header("Content-Type","application/json");
        Response response = requestSpec.request(Method.POST,"/"+path);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return response;
    }

    public Response updateRequest(int id, Object accountUpdated,String url, String path){
        RestAssured.baseURI = url;
        RequestSpecification requestSpec = RestAssured.given().log().all();
        JSONObject requestParam = new JSONObject();
        requestSpec.header("Content-Type","application/json");
        requestSpec.log().all().body(accountUpdated);
        Response response = requestSpec.log().all().request(Method.PUT,"/"+path+"/"+id);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return response;
    }

    public Response deleteRequest(int id, String url, String path){
        RestAssured.baseURI = url;
        RequestSpecification requestSpec = RestAssured.given().log().all();
        Response response = requestSpec.request(Method.DELETE,"/"+path+"/"+id);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return response;
    }

}
