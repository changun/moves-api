package co.nutrino.api.moves.impl.dto.activity;

import org.joda.time.DateTime;

import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class MovesActivity {
    private MovesActivityEnum group;
    private String activity;
    private boolean manual;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime startTime;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime endTime;
    private int duration;
    private int distance;
    private int steps;
    private int calories;
    private TrackPoint[] trackPoints;

    public MovesActivityEnum getGroup() {
	return this.group;
    }

    public void setGroup(MovesActivityEnum activity) {
	this.group = activity;
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

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}
}