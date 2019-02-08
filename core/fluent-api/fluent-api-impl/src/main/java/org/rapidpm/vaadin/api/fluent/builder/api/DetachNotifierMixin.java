package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.DetachNotifier;
import com.vaadin.flow.shared.Registration;

public interface DetachNotifierMixin<R extends DetachNotifierMixin, T extends DetachNotifier>
    extends NeutralMixin<R, T> {

  //<R extends ComponentMixin<T>>
  default R addDetachListener(ComponentEventListener<DetachEvent> listener ,
                              Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addDetachListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addDetachListener(ComponentEventListener<DetachEvent> listener) {
    component().map(component -> component.addDetachListener(listener));
    return (R) this;
  }


}
