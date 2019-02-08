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
package junit.org.rapidpm.vaadin.demo.workspaces;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.SpanElement;
import org.openqa.selenium.WebDriver;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.container.ContainerInfo;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;
import org.rapidpm.vaadin.demo.workspaces.ClickCounterWorkspace;

import static java.lang.Integer.valueOf;

public class ClickCounterWorkspacePageObject extends AbstractVaadinPageObject {


  public ClickCounterWorkspacePageObject(WebDriver webdriver, ContainerInfo containerInfo) {
    super(webdriver, containerInfo);
  }

  public ButtonElement btnClickMe() {
    return btn().id(ClickCounterWorkspace.BTN_CLICK_ME_ID);
  }

  public SpanElement lbClickCount() {
    return span().id(ClickCounterWorkspace.LB_CLICK_COUNT_ID);
  }

  public void click() {
    btnClickMe().click();
  }

  public String clickCountAsString() {
    return lbClickCount().getText();
  }

  // no exception handling
  public int clickCount() {
    return valueOf(clickCountAsString());
  }

}


