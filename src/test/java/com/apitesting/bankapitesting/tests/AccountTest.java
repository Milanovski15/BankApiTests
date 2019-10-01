package com.apitesting.bankapitesting.tests;

import com.apitesting.bankapitesting.models.AccountModel;
import com.apitesting.bankapitesting.service.AccountService;
import com.apitesting.bankapitesting.service.ClientService;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;

public class AccountTest {
    private AccountService accountService = new AccountService();
    private ClientService clientService = new ClientService();
    private int clientId;

    @BeforeClass
    public void setUp() {
        clientId = clientService.generateAndCreateClient("NameOfTheClient", "1", true, "Address", "Skopje", "Macedonia");
    }

    @Test
    public void ShouldReturnAllAccounts() {
        Response response = accountService.getAllAccounts();
        assertEquals("The http status code should be 200-OK", 200, response.getStatusCode());
    }

    @Test
    public void ShouldReturnSpecificAccount() {
        AccountModel account = accountService.generateAccountBody(clientId, 2, null, "0",true);
        AccountModel createdAccount = accountService.postAccount(account).as(AccountModel.class);
        Response isSuccessfull = accountService.getAccountById(createdAccount.getId());
        AccountModel returnAccount = accountService.getAccountById(createdAccount.getId()).as(AccountModel.class);

        assertEquals("The http status code should be 200-OK", 200, isSuccessfull.getStatusCode());
        assertEquals(createdAccount.getId(),returnAccount.getId());
//      assertEquals(returnAccount.getAccountTypeId(),2);
//      assertEquals(returnAccount.getIsActive(),true);
    }

    @Test
    public void ShouldAddAccount() {
        AccountModel account = accountService.generateAccountBody(clientId, 2, null, "0",true);
        AccountModel createdAccount = accountService.postAccount(account).as(AccountModel.class);
        Response response = accountService.postAccount(account);

        assertEquals(createdAccount.getClientId(), clientId);
        assertEquals(createdAccount.getAccountTypeId(), 2);
        assertEquals(createdAccount.getBalance(), "0.0");
        assertEquals(createdAccount.getAllowedDebt(), null);
        assertEquals(createdAccount.getIsActive(), true);
    }

    @Test
    public void ShouldUpdateAccount() {
        AccountModel account = accountService.generateAccountBody(clientId, 2, null,"0" ,true);
        AccountModel createdAccount = accountService.postAccount(account).as(AccountModel.class);
        AccountModel newAccount = accountService.generatePutAccountBody(createdAccount.getId(), clientId, 1, null, true);
        Response response = accountService.updateAccount(createdAccount.getId(), newAccount);
        String s = response.getBody().asString();
        System.out.println("Response:"+s);
        assertEquals("The http status code should be 200-OK", 200, response.getStatusCode());
        assertEquals(createdAccount.getId(),newAccount.getId());
        assertEquals("Account type for the updated account should be 1",newAccount.getAccountTypeId(),1);
    }

    @Test
    public void ShouldDeleteAccount() {
        AccountModel account = accountService.generateAccountBody(clientId, 2, null,"0" ,true);
        AccountModel createdAccount = accountService.postAccount(account).as(AccountModel.class);
        Response response = accountService.deleteAccount(createdAccount.getId());
        Response noAccount = accountService.getAccountById(createdAccount.getId());
        assertEquals("The http status code should be 200-OK", 200, response.getStatusCode());
        assertEquals("The http status of the get request (noAccount) should be 404",404,noAccount.getStatusCode());
    }

    @Test
    public void ShouldNotCreateAccountWithInvalidAccountType(){
        AccountModel account = accountService.generateAccountBody(clientId, 3, null, "0",true);
        Response createdAccount = accountService.postAccount(account);
        assertEquals("The http status code should be 400-OK", 400, createdAccount.getStatusCode());
    }

    @Test
    public void ShouldNotCreatedAccountWithInvalidDepth(){
        AccountModel account = accountService.generateAccountBody(clientId, 1, "1000", "0",true);
        Response createdAccount = accountService.postAccount(account);
        assertEquals("The http status code should be 400-OK", 400, createdAccount.getStatusCode());
    }

    @Test
    public void ShouldNotCreateAccountWithBalance(){
        AccountModel account = accountService.generateAccountBody(clientId, 1,null,"1000" ,true);
        Response createdAccount = accountService.postAccount(account);
        assertEquals("The http status code should be 400-OK", 400, createdAccount.getStatusCode());
    }
}
