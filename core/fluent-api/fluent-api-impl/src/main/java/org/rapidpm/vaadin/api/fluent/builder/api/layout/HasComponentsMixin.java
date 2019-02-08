package org.rapidpm.vaadin.api.fluent.builder.api.layout;

import org.rapidpm.vaadin.api.fluent.builder.api.HasElementMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasEnabledMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;

public interface HasComponentsMixin<R extends HasComponentsMixin, T extends HasComponents>
    extends
    HasElementMixin<R, T>,
    HasEnabledMixin<R, T> {

  default R add(Component... components) {
    return invoke(c -> c.add(components));
  }

  default R remove(Component... components) {
    return invoke(c -> c.remove(components));
  }

  default R removeAll() {
    return invoke(HasComponents::removeAll);
  }


}
