package co.nutrino.api.moves.impl.dto.storyline;






import java.util.Date;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.dto.summary.ActivitySummary;
import co.nutrino.api.moves.impl.response.serialize.MovesDateDeserializer;
import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;


public class MovesStoryline {
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date date;
    
    private MovesSegment[] segments;
    private ActivitySummary[] summary;
    private int caloriesIdle;
    
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime lastUpdate;
    
    public DateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(DateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getDate() {
	return this.date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public MovesSegment[] getSegments() {
	return this.segments;
    }

    public void setSegments(MovesSegment[] segments) {
	this.segments = segments;
    }

    public int getCaloriesIdle() {
	return this.caloriesIdle;
    }

    public void setCaloriesIdle(int caloriesIdle) {
	this.caloriesIdle = caloriesIdle;
    }

	public ActivitySummary[] getSummary() {
		return summary;
	}

	public void setSummary(ActivitySummary[] summary) {
		this.summary = summary;
	}
}
