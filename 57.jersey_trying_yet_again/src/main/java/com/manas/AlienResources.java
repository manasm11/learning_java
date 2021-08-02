package com.manas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/aliens")
public class AlienResources {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<String> getAlien() {
//    public Alien getAlien() {
        System.out.println("getAlien called");
        return new ArrayList<>(Arrays.asList("Manas", "Mishra"));
//        return new Alien("Manas", 30);
    }
}
