package co.nutrino.api.moves.impl.dto.activity;




import co.nutrino.api.moves.impl.response.serialize.MovesActivityEnumDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = MovesActivityEnumDeserializer.class)
public enum MovesActivityEnum {
    Walking("walking"), Running("running"), Cycling("cycling"), Trip("transport");
    private String label;

    private MovesActivityEnum(String label) {
	this.label = label;
    }

    public String getLabel() {
	return this.label;
    }
}
