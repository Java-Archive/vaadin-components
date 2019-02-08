package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.textfield.Autocapitalize;
import com.vaadin.flow.component.textfield.HasAutocapitalize;

public interface HasAutocapitalizeMixin<R extends HasAutocapitalizeMixin, T extends HasAutocapitalize>
    extends HasElementMixin<R, T> {

  default R setAutocapitalize(Autocapitalize autocapitalize) {
    return invoke(c -> c.setAutocapitalize(autocapitalize));
  }
}
