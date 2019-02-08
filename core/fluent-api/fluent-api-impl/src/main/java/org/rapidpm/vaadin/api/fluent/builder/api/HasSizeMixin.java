package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasSize;

public interface HasSizeMixin<R extends HasSizeMixin, T extends HasSize>
    extends HasElementMixin<R, T> {

  default R setWidth(String width) {
    return invoke(c -> c.setWidth(width));
  }

  default R setHeight(String height) {
    return invoke(c -> c.setHeight(height));
  }

  default R setSizeFull() {
    return invoke(HasSize::setSizeFull);
  }

  default R setSizeUndefined() {
    return invoke(HasSize::setSizeUndefined);
  }
}
