package com.example.trying_with_idea_ultimate.resources;

import com.sun.net.httpserver.Headers;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
    @GET
    @Path("/annotations")
    public String getParamsUsingAnnotations(
            @MatrixParam("param1") String matrixParam1,
            @MatrixParam("param2") String matrixParam2,
            @HeaderParam("customHeader") String customHeader,
            @CookieParam("cookeiParam") String cookieParam
    ) {
        return "Param1: " + matrixParam1 + "\tParam2: " + matrixParam2
                + "\n" + "customHeader: " + customHeader
                + "\n" + "cookieParam: " + cookieParam;
    }

    @GET
    @Path("/context")
    public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
        return "Absolute path using uriInfo: " + uriInfo.getAbsolutePath() + "\nContent-Type: " + headers.getRequestHeader("content-type");
    }

}
