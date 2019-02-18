package com.chrisopal.resource.greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author chrisopal
 */
@Path("greeting")
public class GreetingResource {

    @GET
    public String greet() {
        return "Hello from Java EE 8 and MicroProfile!";
    }

}