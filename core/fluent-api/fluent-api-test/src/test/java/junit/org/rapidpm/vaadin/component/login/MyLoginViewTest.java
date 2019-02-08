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


import junit.org.rapidpm.vaadin.demo.workspaces.ClickCounterWorkspacePageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.unittest.VaadinWebUnitTest;
import org.rapidpm.vaadin.component.login.MyLoginView;

@VaadinWebUnitTest
public class MyLoginViewTest {

  @TestTemplate
  @DisplayName("Login - admin / admin ")
  void test001(LoginViewPageObject pageObject) {
    pageObject.loadPage(MyLoginView.NAV_LOGIN);
    Assertions.assertEquals("", pageObject.username());
    Assertions.assertEquals("", pageObject.password());
    pageObject.usernameTF().setValue("admin");
    pageObject.passwordPF().setValue("admin");
    pageObject.btnLogin().click();

    ClickCounterWorkspacePageObject wsPageObject = new ClickCounterWorkspacePageObject(pageObject.getDriver(), pageObject.getContainerInfo());
    wsPageObject.click();
    Assertions.assertEquals(1, wsPageObject.clickCount());



  }


}
