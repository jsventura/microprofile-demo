package com.example.demo.config;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 */
@Path("/config")
@Singleton
public class DemoConfigController {

    @Inject
    private Config config;

    @Inject
    @ConfigProperty(name = "message2", defaultValue = "Hola Mundo!")
    private String message;

    @Inject
    @ConfigProperty(name = "message2")
    private Optional<String> message2;

    @Inject
    @ConfigProperty(name = "demo.products")
    private List<String> products;

    @GET
    public String sayHello() {
//        return config.getValue("message", String.class);
//        return message;
//        return message2.orElse("Hola Mundo Cruel!");
        return products.stream().map(String::toUpperCase).collect(Collectors.joining(","));

    }
}
