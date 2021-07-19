package com.example.tryinh_with_tomee_jdk11.resources;

import com.example.tryinh_with_tomee_jdk11.services.ContactService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

    ContactService contactService = new ContactService();

    @GET
    public String getAllContacts(){
        return "ALL CONTACTS";
    }
}
