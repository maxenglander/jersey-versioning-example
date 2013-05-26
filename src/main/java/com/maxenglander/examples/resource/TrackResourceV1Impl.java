package com.maxenglander.examples.resource;

import com.maxenglander.examples.model.Track;
import com.maxenglander.examples.model.TrackV1Impl;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author maxenglander
 */
@Provider
@Produces("application/vnd.musicstore-v1+json")
public class TrackResourceV1Impl implements TrackResource, ContextResolver<TrackResource> {
    public Track get(int id) {
        return new TrackV1Impl("Woodie Guthrie", "Jackhammer Blues", "2:30", 1941);
    }

    public List<Track> index() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TrackResource getContext(Class<?> type) {
        return this;
    }
}
