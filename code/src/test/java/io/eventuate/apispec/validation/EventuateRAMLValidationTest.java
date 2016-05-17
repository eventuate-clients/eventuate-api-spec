package io.eventuate.apispec.validation;

import org.junit.Test;
import org.raml.parser.rule.ValidationResult;
import org.raml.parser.visitor.RamlValidationService;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class EventuateRAMLValidationTest {

  @Test
  public void shouldBeValid() {
    List<ValidationResult> results = RamlValidationService.createDefault().validate("../spec/v1/eventuate.raml");
    assertTrue("Should be empty: " + results, results.isEmpty());
  }
}
