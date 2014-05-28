package co.nutrino.api.moves.impl.dto.storyline;






import org.joda.time.DateTime;

import co.nutrino.api.moves.impl.dto.activity.MovesActivity;
import co.nutrino.api.moves.impl.response.serialize.MovesDateTimeDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class MovesSegment {
    private MovesSegmentTypeEnum type;

    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime startTime;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime endTime;
    @JsonDeserialize(using = MovesDateTimeDeserializer.class)
    private DateTime lastUpdate;
    
    private MovesPlace place;
    private MovesActivity[] activities;

    public MovesSegmentTypeEnum getType() {
	return this.type;
    }

    public void setType(MovesSegmentTypeEnum type) {
	this.type = type;
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

    public MovesPlace getPlace() {
	return this.place;
    }

    public void setPlace(MovesPlace place) {
	this.place = place;
    }

    public MovesActivity[] getActivities() {
	return this.activities;
    }

    public void setActivities(MovesActivity[] activities) {
	this.activities = activities;
    }
}
