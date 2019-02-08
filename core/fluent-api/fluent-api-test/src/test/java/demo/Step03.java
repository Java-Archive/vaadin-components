package demo;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public class Step03 {

  final PasswordField password = new PasswordField() {{
    setPlaceholder("password");
    setId("pf-password-id");
    setValueChangeMode(ValueChangeMode.EAGER);
    setVisible(true);
    setRequired(true);
  }};

}
