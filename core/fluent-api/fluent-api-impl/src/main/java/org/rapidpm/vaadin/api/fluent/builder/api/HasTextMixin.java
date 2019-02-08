package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.HasText;

public interface HasTextMixin<R extends HasTextMixin, T extends HasText>
    extends HasElementMixin<R, T> {

  default R setText(String text) {
    return invoke(c -> c.setText(text));
  }

}
