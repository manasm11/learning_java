package com.example.tryinh_with_tomee_jdk11.resources;

import com.example.tryinh_with_tomee_jdk11.exceptions.ContactAlreadyExistsException;
import com.example.tryinh_with_tomee_jdk11.exceptions.ContactDoesntExistsException;
import com.example.tryinh_with_tomee_jdk11.models.Contact;
import com.example.tryinh_with_tomee_jdk11.services.ContactService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

    ContactService contactService = new ContactService();

    @GET
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @POST
    public Contact createContact(Contact contact) throws ContactDoesntExistsException, ContactAlreadyExistsException {
        if (contact.getName() == null)
            throw new ContactDoesntExistsException("Please define contact 'name' in post request.");
        contactService.addContact(contact);
        return contact;
    }

    @GET
    @Path("/{name}")
    public Contact getContact(@PathParam("name") String name) throws ContactDoesntExistsException {
        return contactService.getContact(name);
    }

    @PUT
    @Path("/{name}")
    public Contact updateContact(@PathParam("name") String name, Contact contact) throws ContactDoesntExistsException {
        contact.setName(name);
        return contactService.updateContact(contact);
    }

    @DELETE
    @Path("/{name}")
    public void removeContact(@PathParam("name") String name) throws ContactDoesntExistsException {
        contactService.removeContact(name);
    }
}
