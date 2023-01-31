package com.example.mioclientrest.web;



import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class Test {

    public static void main(String[] args) {

        ClientConfig cConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(cConfig);
        WebTarget target = client.target("http://localhost:8080");
        String helloWorld = target.path("api/thirdService/stampaHelloWorld").request().accept(MediaType.TEXT_HTML).get(String.class);
        System.out.println(helloWorld);
        String sommaConDue = target.path("thirdService/sommaConDue/4").request().toString();
        System.out.println(sommaConDue);
    }
}
