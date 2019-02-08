package org.rapidpm.vaadin.api.fluent.builder.api;

import static com.vaadin.flow.component.ComponentUtil.addListener;

import java.util.function.Consumer;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;

public interface BlurNotifierMixin<R extends BlurNotifierMixin, T extends BlurNotifier>
    extends NeutralMixin<R, T> {

  default R addBlurListener(ComponentEventListener<BlurEvent<? extends Component>> listener ,
                            Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> addListener((Component) component ,
                                      BlurEvent.class ,
                                      (ComponentEventListener) listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addBlurListener(ComponentEventListener<BlurEvent<? extends Component>> listener) {
    component()
        .map(component -> addListener((Component) component ,
                                      BlurEvent.class ,
                                      (ComponentEventListener) listener));
    return (R) this;
  }


}
