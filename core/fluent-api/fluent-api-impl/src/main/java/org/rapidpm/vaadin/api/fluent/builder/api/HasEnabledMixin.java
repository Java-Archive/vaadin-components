package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasEnabled;

public interface HasEnabledMixin<R extends HasEnabledMixin, T extends HasEnabled>
    extends HasElementMixin<R, T> {

  default R setEnabled(boolean enabled) {
    return invoke(c -> c.setEnabled(enabled));
  }
}
