package org.rapidpm.vaadin.api.fluent.builder.api;

import static com.vaadin.flow.component.ComponentUtil.addListener;

import java.util.function.Consumer;

import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.FocusNotifier;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.shared.Registration;

public interface AbstractFieldMixin<R extends AbstractFieldMixin, T extends AbstractField>
    extends HasValueAndElementMixin<R, T>,
    ComponentMixin<R, T> {

  default R setValue(Object value) {
    return invoke(c -> c.setValue(value));
  }

  default R addValueChangeListener(
      HasValue.ValueChangeListener listener ,
      Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> addListener(component ,
                                      FocusNotifier.FocusEvent.class ,
                                      (ComponentEventListener) listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addValueChangeListener(HasValue.ValueChangeListener listener) {
    component()
        .map(component -> addListener(component ,
                                      FocusNotifier.FocusEvent.class ,
                                      (ComponentEventListener) listener));
    return (R) this;
  }


}
