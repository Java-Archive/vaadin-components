package org.rapidpm.vaadin.api.fluent.builder.api;

import com.vaadin.flow.data.binder.HasFilterableDataProvider;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.function.SerializableFunction;

public interface HasFilterableDataProviderMixin<
    R extends HasFilterableDataProviderMixin,
    T extends HasFilterableDataProvider>
    extends
    HasItemsMixin<R, T> {


  default R setDataProvider(DataProvider dataProvider) {
    return invoke(c -> c.setDataProvider(dataProvider));
  }

  default R setDataProvider(DataProvider dataProvider , SerializableFunction filterConverter) {
    return invoke(c -> c.setDataProvider(dataProvider , filterConverter));
  }

}
