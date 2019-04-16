package demo;

import java.util.function.BiFunction;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public class Step01 {
  {
    final PasswordField password = new PasswordField();
    password.setPlaceholder("password");
    password.setId("pf-password-id");
    password.setValueChangeMode(ValueChangeMode.EAGER);
    password.setVisible(true);
    password.setRequired(true);
  }



  public static class MyLegacyClass {

    public String dowork(int a, String b){
      return "";
    }
  }

  {
    final MyLegacyClass myLegacyClass = new MyLegacyClass();
    final BiFunction<Integer, String, String> dowork = myLegacyClass::dowork;

  }


}
