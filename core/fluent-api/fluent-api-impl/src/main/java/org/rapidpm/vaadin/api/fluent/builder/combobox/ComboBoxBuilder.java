package org.rapidpm.vaadin.api.fluent.builder.combobox;

import java.util.function.Supplier;

import org.rapidpm.frp.model.Result;
import org.rapidpm.vaadin.api.fluent.builder.ComponentHolder;
import com.vaadin.flow.component.combobox.ComboBox;

public class ComboBoxBuilder extends ComponentHolder<ComboBox>
    implements ComboBoxMixin {

  public ComboBoxBuilder(Result<ComboBox> component) {
    super(component);
  }

  public ComboBoxBuilder(Supplier<ComboBox> supplier) {
    super(supplier);
  }
}
