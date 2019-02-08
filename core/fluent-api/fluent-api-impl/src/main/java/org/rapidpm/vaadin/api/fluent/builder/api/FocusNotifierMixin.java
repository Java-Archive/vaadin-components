package org.rapidpm.vaadin.api.fluent.builder.api;

import static com.vaadin.flow.component.ComponentUtil.addListener;

import java.util.function.Consumer;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.FocusNotifier;
import com.vaadin.flow.component.FocusNotifier.FocusEvent;
import com.vaadin.flow.shared.Registration;

public interface FocusNotifierMixin<R extends FocusNotifierMixin, T extends FocusNotifier>
    extends NeutralMixin<R, T> {


  default R addFocusListener(ComponentEventListener<FocusEvent<? extends Component>> listener ,
                             Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> addListener((Component) component ,
                                      FocusEvent.class ,
                                      (ComponentEventListener) listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addFocusListener(ComponentEventListener<FocusEvent<? extends Component>> listener) {
    component()
        .map(component -> addListener((Component) component ,
                                      FocusEvent.class ,
                                      (ComponentEventListener) listener));
    return (R) this;
  }


}
