package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.textfield.HasAutocorrect;

public interface HasAutocorrectMixin<R extends HasAutocorrectMixin, T extends HasAutocorrect>
    extends HasElementMixin<R, T> {

  default R setAutocorrect(boolean autocorrect) {
    return invoke(c -> c.setAutocorrect(autocorrect));
  }
}
