package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.Track;
import com.maxenglander.examples.model.TrackV2Impl;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author maxenglander
 */
@Provider
@Produces("application/vnd.musicstore-v2+json")
public class TrackResourceV2Impl implements TrackResource, ContextResolver<TrackResource> {
    public List<Track> index() {
        return new LinkedList() {{
            add(new TrackV2Impl("Woodie Guthrie", "Jackhammer Blues", 150, 1941));
            add(new TrackV2Impl("Paul Simon", "Graceland", 291, 1986));
        }};
    }
    
    public Track get(int id) {
        return new TrackV2Impl("Woodie Guthrie", "Jackhammer Blues", 150, 1941);
    }

    public TrackResource getContext(Class<?> type) {
        return this;
    }
}
