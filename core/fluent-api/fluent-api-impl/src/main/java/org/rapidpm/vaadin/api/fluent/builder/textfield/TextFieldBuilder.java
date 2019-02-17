/**
 * Copyright © 2018 Sven Ruppert (sven.ruppert@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.api.fluent.builder.textfield;

import java.util.function.Supplier;

import org.rapidpm.frp.model.Result;
import org.rapidpm.vaadin.api.fluent.builder.ComponentHolder;
import com.vaadin.flow.component.textfield.TextField;

public class TextFieldBuilder
    extends ComponentHolder<TextField>
    implements TextFieldMixin {

  public TextFieldBuilder(Result<TextField> component) {
    super(component);
  }

  public TextFieldBuilder(Supplier<TextField> supplier) {
    super(supplier);
  }

  public TextFieldBuilder(TextField t) {
    super(t);
  }
}
