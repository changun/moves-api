package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;


public class MovesDateTimeDeserializer extends JsonDeserializer<DateTime> {

    @Override
    public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = jp.getCodec();
		JsonNode node = oc.readTree(jp);
		DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("yyyyMMdd");
		DateTimeFormatter dateTimeformatter = DateTimeFormat.forPattern("yyyyMMdd'T'HHmmssZ");
		dateTimeformatter = dateTimeformatter.withOffsetParsed();
		String dateString = node.asText();
		if(dateString.contains("T")){
			// it is a ISO string without '-' and ':'
			return dateTimeformatter.parseDateTime(dateString);
		}
		else{
			// it is a ISO string with date only and without '-'
			return dateFormatter.parseDateTime(dateString);
		}
    }
}
