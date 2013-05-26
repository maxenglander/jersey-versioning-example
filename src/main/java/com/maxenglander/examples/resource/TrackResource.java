package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.Track;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author maxenglander
 */
public interface TrackResource {
    @GET
    @Produces("application/vnd.musicstore-v2+json")
    List<Track> index();
    
    @GET    
    @Path("/{id}")
    @Produces({"application/vnd.musicstore-v1+json", "application/vnd.musicstore-v2+json"})
    Track get(@PathParam("id") int id);        
}
