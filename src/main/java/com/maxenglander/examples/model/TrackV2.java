package com.maxenglander.examples.model;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author maxenglander
 */
public class TrackV2 extends TrackV1 {
    private final int lengthInSeconds;
    
    public TrackV2(String artistName, String title, int length, int year) {        
        super(artistName, title, (length / 60) + ":" + (length % 60), year);
        this.lengthInSeconds = length;
    }
    
    @Override
    public Object getLength() {
        return lengthInSeconds;
    }
            
    @Override
    @JsonIgnore
    public int getYear() {
        return super.getYear();
    }
}
