package org.rapidpm.vaadin.api.fluent.builder;

import java.util.function.Supplier;

import org.rapidpm.vaadin.api.fluent.builder.textfield.TextFieldBuilder;
import com.vaadin.flow.component.textfield.TextField;

public interface ComponentBuilder {

  static TextFieldBuilder textFieldBuilder() {
    return textFieldBuilder(TextField::new);
  }

  static TextFieldBuilder textFieldBuilder(Supplier<TextField> supplier) {
    return new TextFieldBuilder(supplier);
  }


}
