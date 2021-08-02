package com.manas;

import javax.ws.rs.*;
import java.util.List;

@Path("/aliens")
public class AlienResources {
    AlienRepository repository = new AlienRepository();

    @GET
    public List<Alien> getAliens() {
        return repository.getAliens();
    }

    @POST
    public Alien createAlien(Alien alien) {
        System.out.println("Alien: " + alien);
        return repository.createAlien(alien);
    }

    @GET
    @Path("/{name}")
    public Alien getAlien(@PathParam("name") String name) {
        return repository.getAlien(name);
    }
}
