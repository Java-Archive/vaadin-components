package org.rapidpm.vaadin.api.fluent.builder.api.layout;

import java.util.function.Consumer;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasOrderedComponents;

public interface HasOrderedComponentsMixin<R extends HasOrderedComponentsMixin, T extends HasOrderedComponents>
    extends HasComponentsMixin<R, T> {

  default R replace(Component oldComponent , Component newComponent) {
    return invoke(c -> c.replace(oldComponent , newComponent));
  }

  default R indexOf(Component component ,
                    Consumer<Integer> resultConsumer) {
    component()
        .map(c -> c.indexOf(component))
        .ifPresent(resultConsumer);
    return (R) this;
  }

  default R indexOf(Component component) {
    component()
        .map(c -> c.indexOf(component));
    return (R) this;
  }

}
