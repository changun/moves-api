package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;


public class MovesDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	String dateString = node.asText();

	try {
	    return MovesDateParser.toDate(dateString);
	} catch (ParseException e) {
	    throw new JsonMappingException("Could not parse date string " + dateString, e);
	}
    }
}
