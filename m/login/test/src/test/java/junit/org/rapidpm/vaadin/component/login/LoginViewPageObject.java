/**
 * Copyright © 2018 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package junit.org.rapidpm.vaadin.component.login;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import org.openqa.selenium.WebDriver;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.container.ContainerInfo;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;
import org.rapidpm.vaadin.component.login.LoginView;

public class LoginViewPageObject extends AbstractVaadinPageObject {


  public LoginViewPageObject(WebDriver webdriver, ContainerInfo containerInfo) {
    super(webdriver, containerInfo);
  }


  public TextFieldElement usernameTF() {
    return textField().id(LoginView.TF_USERNAME_ID);
  }

  public PasswordFieldElement passwordPF() {
    return passwordField().id(LoginView.PF_PASSWORD_ID);
  }

  public String username() {
    return usernameTF().getValue();
  }

  public String password() {
    return passwordPF().getValue();
  }

  public ButtonElement btnLogin() {
    return btn().id(LoginView.BTN_LOGIN_ID);
  }

  public ButtonElement btnCancel() {
    return btn().id(LoginView.BTN_CANCEL_ID);
  }


}
