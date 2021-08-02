package mishra.manas;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/aliens")
public class AlienResources {

    @GET
    public Alien getAlien() {
        return new Alien("Manas", 30);
    }
}
