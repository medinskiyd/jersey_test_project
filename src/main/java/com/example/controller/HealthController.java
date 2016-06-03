package com.example.controller;

import com.example.Core.Health;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by DMedinskiy on 31.05.2016.
 */
@Component //Spring component
@Path("/health") //Path
public class HealthController {
    @GET //Request type
    @Produces("application/json") //Produces value
    public Health health() {
        return new Health("Jersey: Up and Running!"); //Return JSON in response
    }
}
