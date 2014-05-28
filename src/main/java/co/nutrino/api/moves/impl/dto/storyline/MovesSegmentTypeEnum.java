package co.nutrino.api.moves.impl.dto.storyline;





import co.nutrino.api.moves.impl.response.serialize.MovesSegmentTypeEnumDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = MovesSegmentTypeEnumDeserializer.class)
public enum MovesSegmentTypeEnum {
    Move, Place;
}
