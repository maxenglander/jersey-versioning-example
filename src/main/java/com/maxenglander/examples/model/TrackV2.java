package com.maxenglander.examples.model;

/**
 *
 * @author maxenglander
 */
public class TrackV2 extends TrackV1 {
    private final int lengthInSeconds;
    
    public TrackV2(String artistName, String title, int length) {        
        super(artistName, title, (length / 60) + ":" + (length % 60));
        this.lengthInSeconds = length;
    }
    
    @Override
    public Object getLength() {
        return lengthInSeconds;
    }   
}
