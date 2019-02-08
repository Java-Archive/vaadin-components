package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.Collection;

import com.vaadin.flow.data.binder.HasDataProvider;
import com.vaadin.flow.data.provider.DataProvider;

public interface HasDataProviderMixin<R extends HasDataProviderMixin, T extends HasDataProvider>
    extends HasItemsMixin<R, T> {

  default R setDataProvider(DataProvider dataProvider) {
    return invoke(c -> c.setDataProvider(dataProvider));
  }

  default R setItems(Collection items) {
    return invoke(c -> c.setItems(items));
  }

}
