package com.maxenglander.examples;

import com.maxenglander.examples.resource.TrackResourceV1Impl;
import com.maxenglander.examples.resource.TrackResourceV2Impl;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

/**
 *
 * @author maxenglander
 */
public class App {
    public static void main(String[] args) {
        try {            
            final ResourceConfig resourceConfig = new PackagesResourceConfig("com.maxenglander.examples");
            resourceConfig.getProviderClasses().add(TrackResourceV1Impl.class);
            resourceConfig.getProviderClasses().add(TrackResourceV2Impl.class);
            resourceConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
            HttpServer httpServer = HttpServerFactory.create("http://localhost:8080/", resourceConfig);
            httpServer.start();
        } catch(IOException e) {            
            e.printStackTrace(System.out);
        }
    }
}
