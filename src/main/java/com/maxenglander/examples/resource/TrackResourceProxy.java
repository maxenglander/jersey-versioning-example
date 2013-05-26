package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.Track;
import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Providers;

/**
 *
 * @author maxenglander
 */
@Path("/track")
@Resource
public class TrackResourceProxy implements TrackResource {        
    private TrackResource trackResource;
    
    public TrackResourceProxy(@Context Providers providers, @Context HttpHeaders httpHeaders) {
        for(MediaType mediaType : httpHeaders.getAcceptableMediaTypes()) {
            ContextResolver<TrackResource> trackResourceResolver =
                providers.getContextResolver(TrackResource.class, mediaType);

            if(trackResourceResolver != null) {                        
                trackResource = trackResourceResolver.getContext(null);                                
            }
        }
    }
    
    public List<Track> index() {
        return trackResource.index();
    }

    public Track get(int id) {
        return trackResource.get(id);
    }
}
