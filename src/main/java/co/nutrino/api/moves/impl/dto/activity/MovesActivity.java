package co.nutrino.api.moves.impl.dto.activity;

import java.util.Date;





import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;


public class MovesActivity {
    private MovesActivityEnum activity;

    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime startTime;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime endTime;
    private int duration;
    private int distance;
    private int steps;
    private int calories;
    private TrackPoint[] trackPoints;

    public MovesActivityEnum getActivity() {
	return this.activity;
    }

    public void setActivity(MovesActivityEnum activity) {
	this.activity = activity;
    }

    public DateTime getStartTime() {
	return this.startTime;
    }

    public void setStartTime(DateTime startTime) {
	this.startTime = startTime;
    }

    public DateTime getEndTime() {
	return this.endTime;
    }

    public void setEndTime(DateTime endTime) {
	this.endTime = endTime;
    }

    public int getDuration() {
	return this.duration;
    }

    public int getDistance() {
	return this.distance;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public void setDistance(int distance) {
	this.distance = distance;
    }

    public int getSteps() {
	return this.steps;
    }

    public void setSteps(int steps) {
	this.steps = steps;
    }

    public int getCalories() {
	return this.calories;
    }

    public void setCalories(int calories) {
	this.calories = calories;
    }

    public TrackPoint[] getTrackPoints() {
	return this.trackPoints;
    }

    public void setTrackPoints(TrackPoint[] trackPoints) {
	this.trackPoints = trackPoints;
    }
}