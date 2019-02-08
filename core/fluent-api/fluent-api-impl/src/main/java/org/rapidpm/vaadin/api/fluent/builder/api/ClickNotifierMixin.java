package org.rapidpm.vaadin.api.fluent.builder.api;

import static com.vaadin.flow.component.ComponentUtil.addListener;

import java.util.function.Consumer;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;

public interface ClickNotifierMixin<R extends ClickNotifierMixin, T extends ClickNotifier>
    extends NeutralMixin<R, T> {

  default R addClickListener(ComponentEventListener<ClickEvent<? extends Component>> listener ,
                             Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> addListener((Component) component ,
                                      ClickEvent.class ,
                                      (ComponentEventListener) listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addClickListener(ComponentEventListener<ClickEvent<? extends Component>> listener) {
    component()
        .map(component -> addListener((Component) component ,
                                      ClickEvent.class ,
                                      (ComponentEventListener) listener));
    return (R) this;
  }

}
