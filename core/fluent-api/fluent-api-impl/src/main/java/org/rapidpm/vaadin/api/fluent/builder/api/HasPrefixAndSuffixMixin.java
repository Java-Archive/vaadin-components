package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.HasPrefixAndSuffix;

public interface HasPrefixAndSuffixMixin<R extends HasPrefixAndSuffixMixin, T extends HasPrefixAndSuffix>
    extends HasElementMixin<R, T> {

  default R setPrefixComponent(Component component) {
    return invoke(c -> c.setPrefixComponent(component));
  }

  default R setSuffixComponent(Component component) {
    return invoke(c -> c.setSuffixComponent(component));
  }
}
