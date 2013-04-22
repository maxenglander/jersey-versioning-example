package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.Track;
import com.maxenglander.examples.model.TrackV1;
import com.maxenglander.examples.model.TrackV2;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static final Logger logger = Logger.getLogger("jersey-versioning");
    
    @GET
    @Path("/{id}")
    @Produces("application/vnd.musicstore-v1+json")    
    public Track getV1(@PathParam("id") int id) {        
        logger.log(Level.INFO, "Returning v1 track {0}", id);        
        return new TrackV1("Woodie Guthrie", "Jackhammer Blues", "2:30");
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/vnd.musicstore-v2+json")
    public Track getV2(@PathParam("id") int id) {
        logger.log(Level.INFO, "Returning v2 track {0}", id);        
        return new TrackV2("Woodie Guthrie", "Jackhammer Blues", 150);        
    }
}
