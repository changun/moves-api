package co.nutrino.api.moves.impl.dto.storyline;

import java.util.Date;




import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesDateDeserializer;


public class MovesStoryline {
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date date;
    private MovesSegment[] segments;
    private int caloriesIdle;

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
}
