package co.nutrino.api.moves.impl.dto.activity;

import java.util.Date;






import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;


public class TrackPoint {
    private float lat;
    private float lon;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime timestamp;

    public float getLat() {
	return this.lat;
    }

    public void setLat(float lat) {
	this.lat = lat;
    }

    public float getLon() {
	return this.lon;
    }

    public void setLon(float lon) {
	this.lon = lon;
    }

    public DateTime getTimestamp() {
	return this.timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
	this.timestamp = timestamp;
    }
}