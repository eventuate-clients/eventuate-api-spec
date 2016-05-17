package io.eventuate.apispec.validation;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EventuateStompSchemaValidationTest {

  @Test
  public void destinationHeaderSchemaShouldBeValid() throws FileNotFoundException {
    validateSchema("destination-header.json");
  }

  @Test
  public void stompEventSchemaShouldBeValid() throws FileNotFoundException {
    validateSchema("stomp-event.json");
  }

  private void validateSchema(String schemaFile) throws FileNotFoundException {
    FileInputStream inputStream = new FileInputStream("../spec/v1/schemas/stomp/" + schemaFile);
    JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
    Schema schema = SchemaLoader.load(rawSchema);
  }
}
