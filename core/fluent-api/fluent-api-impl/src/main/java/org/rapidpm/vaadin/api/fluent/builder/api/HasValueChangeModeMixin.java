package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.data.value.HasValueChangeMode;
import com.vaadin.flow.data.value.ValueChangeMode;

public interface HasValueChangeModeMixin<R extends HasValueChangeModeMixin, T extends HasValueChangeMode>
    extends NeutralMixin<R, T> {

  default R setValueChangeMode(ValueChangeMode valueChangeMode) {
    return invoke(c -> c.setValueChangeMode(valueChangeMode));
  }
}


