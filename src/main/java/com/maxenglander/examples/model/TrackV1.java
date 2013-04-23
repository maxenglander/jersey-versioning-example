package com.maxenglander.examples.model;

/**
 *
 * @author maxenglander
 */
public class TrackV1 {
    private final String artistName;
    private final String length;
    private final String title;
    
    public TrackV1(String artistName, String title, String length) {
        this.artistName = artistName;
        this.length = length;
        this.title = title;
    }
    
    public String getArtistName() {
        return this.artistName;
    }
    
    public Object getLength() {
        return length;
    }
    
    public String getTitle() {
        return this.title;
    }
}
