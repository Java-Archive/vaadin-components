package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasValidation;

public interface HasValidationMixin<R extends HasValidationMixin, T extends HasValidation>
    extends NeutralMixin<R, T> {

  default R setErrorMessage(String errorMessage) {
    return invoke(c -> c.setErrorMessage(errorMessage));
  }

  default R setInvalid(boolean invalid) {
    return invoke(c -> c.setInvalid(invalid));
  }
}
