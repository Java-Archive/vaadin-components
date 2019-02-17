package org.rapidpm.vaadin.api.fluent.builder;

import java.util.function.Supplier;

import org.rapidpm.vaadin.api.fluent.builder.button.ButtonBuilder;
import org.rapidpm.vaadin.api.fluent.builder.layout.horizontal.HorizontalLayoutBuilder;
import org.rapidpm.vaadin.api.fluent.builder.layout.vertical.VerticalLayoutBuilder;
import org.rapidpm.vaadin.api.fluent.builder.textfield.TextFieldBuilder;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public interface ComponentBuilder {

  static ButtonBuilder buttonBuilder() {
    return buttonBuilder(Button::new);
  }

  static ButtonBuilder buttonBuilder(Button b) {
    return new ButtonBuilder(b);
  }

  static ButtonBuilder buttonBuilder(Supplier<Button> supplier) {
    return new ButtonBuilder(supplier);
  }

  static TextFieldBuilder textFieldBuilder() {
    return textFieldBuilder(TextField::new);
  }

  static TextFieldBuilder textFieldBuilder(TextField t) {
    return new TextFieldBuilder(t);
  }

  static TextFieldBuilder textFieldBuilder(Supplier<TextField> supplier) {
    return new TextFieldBuilder(supplier);
  }




  //layouts
  static VerticalLayoutBuilder verticalLayoutBuilder() {
    return verticalLayoutBuilder(VerticalLayout::new);
  }

  static VerticalLayoutBuilder verticalLayoutBuilder(VerticalLayout t) {
    return new VerticalLayoutBuilder(t);
  }

  static VerticalLayoutBuilder verticalLayoutBuilder(Supplier<VerticalLayout> supplier) {
    return new VerticalLayoutBuilder(supplier);
  }

  static HorizontalLayoutBuilder horizontalLayoutBuilder() {
    return horizontalLayoutBuilder(HorizontalLayout::new);
  }

  static HorizontalLayoutBuilder horizontalLayoutBuilder(HorizontalLayout t) {
    return new HorizontalLayoutBuilder(t);
  }

  static HorizontalLayoutBuilder horizontalLayoutBuilder(Supplier<HorizontalLayout> supplier) {
    return new HorizontalLayoutBuilder(supplier);
  }
}


