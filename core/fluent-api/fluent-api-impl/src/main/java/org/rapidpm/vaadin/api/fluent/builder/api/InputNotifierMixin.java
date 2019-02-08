package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.InputNotifier;
import com.vaadin.flow.shared.Registration;

public interface InputNotifierMixin<R extends InputNotifierMixin, T extends InputNotifier>
    extends NeutralMixin<R, T> {

  default R addInputListener(ComponentEventListener<InputEvent> listener) {
    component()
        .ifPresent(c -> c.addInputListener(listener));
    return (R) this;
  }

  default R addInputListener(ComponentEventListener<InputEvent> listener ,
                             Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addInputListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }


}
