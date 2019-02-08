package demo;

import java.util.Optional;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public class Step04 {


  final PasswordField pf = Optional.of(new PasswordField())
                                   .map(pf -> {
                                     pf.setPlaceholder("password");
                                     pf.setId("pf-password-id");
                                     pf.setValueChangeMode(ValueChangeMode.EAGER);
                                     pf.setVisible(true);
                                     pf.setRequired(true);
                                     return pf;
                                   })
                                   .get();
}
