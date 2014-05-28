package co.nutrino.api.moves.impl.dto.summary;








import org.joda.time.DateTime;

import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class UserActivitySummary {
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime DateTime;
    private ActivitySummary[] summary;
    private int caloriesIdle;

    public DateTime getDate() {
	return this.DateTime;
    }

    public void setDate(DateTime DateTime) {
	this.DateTime = DateTime;
    }

    public ActivitySummary[] getSummary() {
	return this.summary;
    }

    public void setSummary(ActivitySummary[] summary) {
	this.summary = summary;
    }

    public int getCaloriesIdle() {
	return this.caloriesIdle;
    }

    public void setCaloriesIdle(int caloriesIdle) {
	this.caloriesIdle = caloriesIdle;
    }
}
