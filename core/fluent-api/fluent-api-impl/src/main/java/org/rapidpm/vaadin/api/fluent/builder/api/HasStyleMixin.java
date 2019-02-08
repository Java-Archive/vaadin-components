package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasStyle;

public interface HasStyleMixin<R extends HasStyleMixin, T extends HasStyle>
    extends HasElementMixin<R, T> {

  default R addClassName(String className) {
    return invoke(c -> c.addClassName(className));
  }

  default R removeClassName(String className) {
    return invoke(c -> c.removeClassName(className));
  }

  default R setClassName(String className) {
    return invoke(c -> c.setClassName(className));
  }

  default R setClassName(String className , boolean set) {
    return invoke(c -> c.setClassName(className , set));
  }

  default R addClassNames(String... classNames) {
    return invoke(c -> c.addClassNames(classNames));
  }

  default R removeClassNames(String... classNames) {
    return invoke(c -> c.removeClassNames(classNames));
  }
}
