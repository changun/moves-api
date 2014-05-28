package co.nutrino.api.moves.impl.dto.storyline;




import co.nutrino.api.moves.impl.response.serialize.MovesPlaceTypeEnumDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = MovesPlaceTypeEnumDeserializer.class)
public enum MovesPlaceTypeEnum {
    Unknown, School, Work, User, Foursquare, Home
}