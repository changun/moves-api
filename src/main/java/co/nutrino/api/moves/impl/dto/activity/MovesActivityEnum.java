package co.nutrino.api.moves.impl.dto.activity;




import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.nutrino.api.moves.impl.response.serialize.MovesActivityEnumDeserializer;


@JsonDeserialize(using = MovesActivityEnumDeserializer.class)
public enum MovesActivityEnum {
    Walking("wlk"), Running("run"), Cycling("cyc"), Trip("trp");

    private String label;

    private MovesActivityEnum(String label) {
	this.label = label;
    }

    public String getLabel() {
	return this.label;
    }
}
