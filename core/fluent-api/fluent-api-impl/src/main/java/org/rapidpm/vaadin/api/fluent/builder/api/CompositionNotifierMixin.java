package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.CompositionEndEvent;
import com.vaadin.flow.component.CompositionNotifier;
import com.vaadin.flow.component.CompositionStartEvent;
import com.vaadin.flow.component.CompositionUpdateEvent;
import com.vaadin.flow.shared.Registration;

public interface CompositionNotifierMixin<R extends CompositionNotifierMixin, T extends CompositionNotifier>
    extends NeutralMixin<R, T> {

  default R addCompositionStartListener(ComponentEventListener<CompositionStartEvent> listener) {
    return invoke(c -> c.addCompositionStartListener(listener));
  }

  default R addCompositionUpdateListener(ComponentEventListener<CompositionUpdateEvent> listener) {
    return invoke(c -> c.addCompositionUpdateListener(listener));
  }

  default R addCompositionEndListener(ComponentEventListener<CompositionEndEvent> listener) {
    return invoke(c -> c.addCompositionEndListener(listener));
  }


  default R addCompositionStartListener(ComponentEventListener<CompositionStartEvent> listener ,
                                        Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionStartListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addCompositionUpdateListener(ComponentEventListener<CompositionUpdateEvent> listener ,
                                         Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionUpdateListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addCompositionEndListener(ComponentEventListener<CompositionEndEvent> listener ,
                                      Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionEndListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }


}
