package co.nutrino.api.moves.impl.dto.storyline;





import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesSegmentTypeEnumDeserializer;


@JsonDeserialize(using = MovesSegmentTypeEnumDeserializer.class)
public enum MovesSegmentTypeEnum {
    Move, Place;
}
