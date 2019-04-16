package org.rapidpm.vaadin.demo.workspaces;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.api.fluent.builder.FluentAPI;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = CheckboxWorkspace.NAV)
public class CheckboxWorkspace extends Composite<Div> implements HasLogger {

  public static final String NAV = "Checkbox";

  public CheckboxWorkspace() {
    final Checkbox c = FluentAPI
        .checkBoxBuilder()
        .setLabel("my label")
        .setAutofocus(true)
        .addClickListener(clickEvent -> logger().info(clickEvent.toString()))
        .build();
    getContent().add(c);
  }
}
