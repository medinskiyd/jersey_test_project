package com.example.jersey.classic;

import com.example.controller.HealthController;
import com.example.controller.TestController;
import com.example.jersey.classic.CustomerController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by DMedinskiy on 31.05.2016.
 */
@Profile("web")
@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HealthController.class);
        register(CustomerController.class);
        register(TestController.class);
    }
}
