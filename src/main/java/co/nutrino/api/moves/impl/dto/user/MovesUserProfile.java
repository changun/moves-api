package co.nutrino.api.moves.impl.dto.user;

import java.util.Date;
import java.util.TimeZone;








import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesDateDeserializer;
import co.nutrino.api.moves.impl.response.serialize.MovesTimezoneDeserializer;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MovesUserProfile {
    @JsonDeserialize(using = MovesDateDeserializer.class)
    private Date firstDate;
    @JsonDeserialize(using = MovesTimezoneDeserializer.class)
    private TimeZone currentTimeZone;
    private boolean caloriesAvailable;

    public Date getFirstDate() {
	return this.firstDate;
    }

    public void setFirstDate(Date firstDate) {
	this.firstDate = firstDate;
    }

    public TimeZone getCurrentTimeZone() {
	return this.currentTimeZone;
    }

    public void setCurrentTimeZone(TimeZone currentTimeZone) {
	this.currentTimeZone = currentTimeZone;
    }

    public boolean isCaloriesAvailable() {
	return this.caloriesAvailable;
    }

    public void setCaloriesAvailable(boolean caloriesAvailable) {
	this.caloriesAvailable = caloriesAvailable;
    }
}
