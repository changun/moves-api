package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;


public class MovesTimezoneDeserializer extends JsonDeserializer<TimeZone> {

    @Override
    public TimeZone deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return TimeZone.getTimeZone(node.findValue("id").asText());
    }
}
