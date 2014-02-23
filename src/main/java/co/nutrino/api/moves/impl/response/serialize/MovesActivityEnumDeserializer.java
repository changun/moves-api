package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;



import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import co.nutrino.api.moves.impl.dto.activity.MovesActivityEnum;


public class MovesActivityEnumDeserializer extends JsonDeserializer<MovesActivityEnum> {
    private static final MovesActivityEnum[] Activities = MovesActivityEnum.values();

    @Override
    public MovesActivityEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return fromLabel(node.asText());
    }

    private MovesActivityEnum fromLabel(String label) {
	for (MovesActivityEnum activity : Activities){
	    if (activity.getLabel().equals(label))
	    	return activity;
	}
	for (MovesActivityEnum activity : Activities){
	    if (activity.name().equals(label))
	    	return activity;
	}
	throw new IllegalArgumentException("Unknown Moves Activity label " + label);
    }
}
