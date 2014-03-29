package co.nutrino.api.moves.impl.dto.summary;

import co.nutrino.api.moves.impl.dto.activity.MovesActivityEnum;

public class ActivitySummary {
    private MovesActivityEnum group;
    private String activity;
    private int duration;
    private int distance;
    private int steps;
    private int calories;

    public MovesActivityEnum getGroup() {
	return this.group;
    }

    public void setGroup(MovesActivityEnum activity) {
	this.group = activity;
    }

    public int getDuration() {
	return this.duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public int getDistance() {
	return this.distance;
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

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
}
