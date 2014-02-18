package co.nutrino.api.moves.impl.response.serialize;

import java.io.IOException;



import org.apache.commons.lang3.text.WordUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import co.nutrino.api.moves.impl.dto.storyline.MovesSegmentTypeEnum;


public class MovesSegmentTypeEnumDeserializer extends JsonDeserializer<MovesSegmentTypeEnum> {

    @Override
    public MovesSegmentTypeEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	ObjectCodec oc = jp.getCodec();
	JsonNode node = oc.readTree(jp);

	return MovesSegmentTypeEnum.valueOf(WordUtils.capitalize(node.asText()));
    }
}
