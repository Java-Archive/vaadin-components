package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasValueAndElement;

public interface HasValueAndElementMixin<R extends HasValueAndElementMixin, T extends HasValueAndElement>
    extends HasValueMixin<R, T>,
    HasEnabledMixin<R, T>,
    HasElementMixin<R, T> {

  default R setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
    return invoke(c -> c.setRequiredIndicatorVisible(requiredIndicatorVisible));
  }

  default R setReadOnly(boolean readOnly) {
    return invoke(c -> c.setReadOnly(readOnly));
  }
}
