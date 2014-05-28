package co.nutrino.api.moves.impl.dto.activity;

import org.joda.time.DateTime;

import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class TrackPoint {
    private float lat;
    private float lon;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime time;

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

    public DateTime getTime() {
	return this.time;
    }

    public void setTime(DateTime timestamp) {
	this.time = timestamp;
    }
}