package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyDownEvent;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.KeyNotifier;
import com.vaadin.flow.component.KeyPressEvent;
import com.vaadin.flow.component.KeyUpEvent;
import com.vaadin.flow.shared.Registration;

public interface KeyNotifierMixin<
    R extends KeyNotifierMixin, T extends KeyNotifier>
    extends NeutralMixin<R, T> {


  default R addKeyDownListener(ComponentEventListener<KeyDownEvent> listener) {
    return invoke(c -> c.addKeyDownListener(listener));
  }

  default R addKeyDownListener(ComponentEventListener<KeyDownEvent> listener,
                               Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addKeyDownListener(listener))
        .ifPresent(registrationConsumer);

    return (R) this;
  }

  default R addKeyPressListener(ComponentEventListener<KeyPressEvent> listener) {
    return invoke(c -> c.addKeyPressListener(listener));
  }

  default R addKeyPressListener(ComponentEventListener<KeyPressEvent> listener,
                                Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addKeyPressListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addKeyUpListener(ComponentEventListener<KeyUpEvent> listener) {
    return invoke(c -> c.addKeyUpListener(listener));
  }

  default R addKeyUpListener(ComponentEventListener<KeyUpEvent> listener,
                             Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addKeyUpListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addKeyDownListener(Key key , ComponentEventListener<KeyDownEvent> listener , KeyModifier... modifiers) {
    return invoke(c -> c.addKeyDownListener(key , listener , modifiers));
  }

  default R addKeyDownListener(Key key , ComponentEventListener<KeyDownEvent> listener ,
                               Consumer<Registration> registrationConsumer, KeyModifier... modifiers) {
    component()
        .map(c -> c.addKeyDownListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addKeyPressListener(Key key , ComponentEventListener<KeyPressEvent> listener , KeyModifier... modifiers) {
    return invoke(c -> c.addKeyPressListener(key , listener , modifiers));
  }

  default R addKeyPressListener(Key key , ComponentEventListener<KeyPressEvent> listener ,
                                Consumer<Registration> registrationConsumer, KeyModifier... modifiers) {
    component()
        .map(c -> c.addKeyPressListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addKeyUpListener(Key key , ComponentEventListener<KeyUpEvent> listener , KeyModifier... modifiers) {
    return invoke(c -> c.addKeyUpListener(key , listener , modifiers));
  }

  default R addKeyUpListener(Key key , ComponentEventListener<KeyUpEvent> listener ,
                             Consumer<Registration> registrationConsumer,
                             KeyModifier... modifiers) {
    component()
        .map(c -> c.addKeyUpListener(key , listener , modifiers))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

}
