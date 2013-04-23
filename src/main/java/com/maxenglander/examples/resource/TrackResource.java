package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.TrackV1;
import com.maxenglander.examples.model.TrackV2;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author maxenglander
 */
@Resource
@Path("/track")
public class TrackResource {        
    @GET
    @Path("/{id}")
    @Produces("application/vnd.musicstore-v1+json")    
    public TrackV1 getV1(@PathParam("id") int id) {        
        return new TrackV1("Woodie Guthrie", "Jackhammer Blues", "2:30");
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/vnd.musicstore-v2+json")
    public TrackV2 getV2(@PathParam("id") int id) {
        return new TrackV2("Woodie Guthrie", "Jackhammer Blues", 150);        
    }
}
