package org.rapidpm.vaadin.api.fluent.builder.api.layout;

import org.rapidpm.vaadin.api.fluent.builder.api.HasElementMixin;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;

public interface ThemableLayoutMixin<R extends ThemableLayoutMixin, T extends ThemableLayout>
    extends HasElementMixin<R, T> {

  default R setMargin(boolean margin) {
    return invoke(c -> c.setMargin(margin));
  }

  default R setPadding(boolean padding) {
    return invoke(c -> c.setPadding(padding));
  }

  default R setSpacing(boolean spacing) {
    return invoke(c -> c.setSpacing(spacing));
  }

  default R setBoxSizing(BoxSizing boxSizing) {
    return invoke(c -> c.setBoxSizing(boxSizing));
  }
}
