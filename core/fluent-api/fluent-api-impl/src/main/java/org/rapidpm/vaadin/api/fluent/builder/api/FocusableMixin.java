package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.component.Focusable;

public interface FocusableMixin<R extends FocusableMixin, T extends Focusable>
    extends
    HasEnabledMixin<R, T>,
    BlurNotifierMixin<R, T>,
    FocusNotifierMixin<R, T> {

  default R setTabIndex(int tabIndex) {
    return invoke(c -> c.setTabIndex(tabIndex));
  }

  default R focus() {
    return invoke(Focusable::focus);
  }

  default R blur() {
    return invoke(Focusable::blur);
  }
}
