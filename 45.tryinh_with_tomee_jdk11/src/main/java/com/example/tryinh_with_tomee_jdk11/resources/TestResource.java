package com.example.tryinh_with_tomee_jdk11.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

    @GET
    public String testFunction() {
        return "API CONFIGURATIONS ARE GOOD !!!";
    }
}
