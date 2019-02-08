package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.textfield.Autocomplete;
import com.vaadin.flow.component.textfield.HasAutocomplete;

public interface HasAutocompleteMixin<R extends HasAutocompleteMixin, T extends HasAutocomplete>
    extends HasElementMixin<R, T> {

  default R setAutocomplete(Autocomplete autocomplete) {
    return invoke(c -> c.setAutocomplete(autocomplete));
  }


}
