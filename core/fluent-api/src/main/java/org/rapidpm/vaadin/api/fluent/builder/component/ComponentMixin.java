/**
 * Copyright © 2018 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.api.fluent.builder.component;

import com.vaadin.flow.component.*;
import com.vaadin.flow.data.binder.Setter;
import com.vaadin.flow.shared.Registration;

import java.util.function.Consumer;

import static com.vaadin.flow.component.ComponentUtil.addListener;

public interface ComponentMixin<T extends Component> extends NeutralMixin<T> {

  default ComponentMixin<T> setId(String id) {
    component().ifPresent(c -> c.setId(id));
    return this;
  }

  default ComponentMixin<T> setVisible(boolean key) {
    component().ifPresent(c -> c.setVisible(key));
    return this;
  }

  default <V> ComponentMixin<T> set(Setter<T, V> target, V value) {
    component().ifPresent(c -> target.accept(c, value));
    return this;
  }


  default ComponentMixin<T> addClickListener(ComponentEventListener<ClickEvent<T>> listener,
                                             Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> addListener(component, ClickEvent.class, (ComponentEventListener) listener))
        .ifPresent(registrationConsumer);
    return this;
  }

  default ComponentMixin<T> addClickListener(ComponentEventListener<ClickEvent<T>> listener) {
    component()
        .map(c -> addListener(c, ClickEvent.class, (ComponentEventListener) listener));
    return this;
  }

  default ComponentMixin<T> addDetachListener(ComponentEventListener<DetachEvent> listener,
                                              Consumer<Registration> registrationConsumer) {
    component().map(component -> component.addDetachListener(listener)).ifPresent(registrationConsumer);
    return this;
  }

  default ComponentMixin<T> addDetachListener(ComponentEventListener<DetachEvent> listener) {
    component().map(component -> component.addDetachListener(listener));
    return this;
  }

  default ComponentMixin<T> addAttachListener(ComponentEventListener<AttachEvent> listener,
                                              Consumer<Registration> registrationConsumer) {
    component().map(component -> component.addAttachListener(listener)).ifPresent(registrationConsumer);
    return this;
  }

  default ComponentMixin<T> addAttachListener(ComponentEventListener<AttachEvent> listener) {
    component().map(component -> component.addAttachListener(listener));
    return this;
  }


}
