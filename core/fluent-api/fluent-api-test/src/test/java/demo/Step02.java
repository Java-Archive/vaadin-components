package demo;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public class Step02 {

  final PasswordField password = new PasswordField();

  public Step02() {
    password.setPlaceholder("password");
    password.setId("pf-password-id");
    password.setValueChangeMode(ValueChangeMode.EAGER);
    password.setVisible(true);
    password.setRequired(true);
  }
}
