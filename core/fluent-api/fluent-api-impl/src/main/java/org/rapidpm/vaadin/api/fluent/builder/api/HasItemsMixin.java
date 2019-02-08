package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.Collection;
import java.util.stream.Stream;

import com.vaadin.flow.data.binder.HasItems;

public interface HasItemsMixin<R extends HasItemsMixin, T extends HasItems>
    extends NeutralMixin<R, T> {

  default R setItems(Collection collection) {
    return invoke(c -> c.setItems(collection));
  }

  default R setItems(Object[] items) {
    return invoke(c -> c.setItems(items));
  }

  default R setItems(Stream streamOfItems) {
    return invoke(c -> c.setItems(streamOfItems));
  }
}
