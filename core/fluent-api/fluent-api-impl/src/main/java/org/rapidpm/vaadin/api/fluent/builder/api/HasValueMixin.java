package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.shared.Registration;

public interface HasValueMixin<R extends HasValueMixin, T extends HasValue>
    extends HasElementMixin<R, T> {


  default R setValue(Object value) {
    return invoke(c -> c.setValue(value));
  }

  default R clear() {
    return invoke(HasValue::clear);
  }

  default R setReadOnly(boolean readOnly) {
    return invoke(c -> c.setReadOnly(readOnly));
  }

  default R setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
    return invoke(c -> c.setRequiredIndicatorVisible(requiredIndicatorVisible));
  }

  default R addValueChangeListener(HasValue.ValueChangeListener listener ,
                                   Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addValueChangeListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addValueChangeListener(HasValue.ValueChangeListener listener) {
    component()
        .map(component -> component.addValueChangeListener(listener));
    return (R) this;
  }

}
