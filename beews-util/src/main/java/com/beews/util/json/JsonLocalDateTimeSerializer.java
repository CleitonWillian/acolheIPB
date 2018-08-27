package com.beews.util.json;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

	public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeString(value == null ? null : value.format(DataUtil.getDataTimeFormat()));

	}

}