package co.nutrino.api.moves.util.convert;

import java.io.IOException;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author yogev
 * 
 * @param <T>
 */
@Component
public class JsonToPojoConverter implements IJsonToPojoConverter, Serializable {

    private final ObjectMapper mapper = new ObjectMapper();
    

    @Override
    public <T> T convertSourceToPojo(String json, Class<T> c) throws ConversionException {
	T toReturn = null;
	try {
	    toReturn = mapper.readValue(json, c);
	} catch (JsonParseException e) {
	    throw new ConversionException("Could not parse JSON", e);
	} catch (JsonMappingException e) {
	    throw new ConversionException("Could not map JSON", e);
	} catch (IOException e) {
	    throw new ConversionException("Error while trying to convert JSON", e);
	}

	return toReturn;
    }

    public <T> T[] convertSourceToPojos(String json, Class<T[]> arrayClass) throws ConversionException {
	T[] toReturn = null;
	try {
	    toReturn = mapper.readValue(json, arrayClass);
	} catch (JsonParseException e) {
	    throw new ConversionException("Could not parse JSON", e);
	} catch (JsonMappingException e) {
	    throw new ConversionException("Could not map JSON", e);
	} catch (IOException e) {
	    throw new ConversionException("Error while trying to convert JSON", e);
	}

	return toReturn;
    }
}
