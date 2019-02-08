package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.AttachNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;

public interface AttachNotifierMixin<R extends AttachNotifierMixin, T extends AttachNotifier>
    extends NeutralMixin<R, T> {

  default R addAttachListener(ComponentEventListener<AttachEvent> listener ,
                              Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addAttachListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addAttachListener(ComponentEventListener<AttachEvent> listener) {
    component()
        .map(component -> component.addAttachListener(listener));
    return (R) this;
  }


}
