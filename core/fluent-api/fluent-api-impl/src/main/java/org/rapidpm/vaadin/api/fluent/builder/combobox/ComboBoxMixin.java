package org.rapidpm.vaadin.api.fluent.builder.combobox;

import java.util.Collection;
import java.util.function.Consumer;

import org.rapidpm.vaadin.api.fluent.builder.api.AbstractSinglePropertyFieldMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasDataProviderMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValidationMixin;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ItemLabelGenerator;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.shared.Registration;

public interface ComboBoxMixin
    extends HasSizeMixin<ComboBoxMixin, ComboBox>,
    AbstractSinglePropertyFieldMixin<ComboBoxMixin, ComboBox>,
    FocusableMixin<ComboBoxMixin, ComboBox>,
    HasStyleMixin<ComboBoxMixin, ComboBox>,
    HasDataProviderMixin<ComboBoxMixin, ComboBox>,
    HasValidationMixin<ComboBoxMixin, ComboBox> {


  default ComboBoxMixin setRenderer(Renderer renderer) {
    return invoke(c -> c.setRenderer(renderer));
  }

  default ComboBoxMixin setFilteredItems(Object[] filteredItems) {
    return invoke(c -> c.setFilteredItems(filteredItems));
  }

  default ComboBoxMixin setFilteredItems(Collection filteredItems) {
    return invoke(c -> c.setFilteredItems(filteredItems));
  }

  default ComboBoxMixin setItemLabelGenerator(ItemLabelGenerator itemLabelGenerator) {
    return invoke(c -> c.setItemLabelGenerator(itemLabelGenerator));
  }

  default ComboBoxMixin setOpened(boolean opened) {
    return invoke(c -> c.setOpened(opened));
  }

  default ComboBoxMixin setAllowCustomValue(boolean allowCustomValue) {
    return invoke(c -> c.setAllowCustomValue(allowCustomValue));
  }

  default ComboBoxMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default ComboBoxMixin setPreventInvalidInput(boolean preventInvalidInput) {
    return invoke(c -> c.setPreventInvalidInput(preventInvalidInput));
  }

  default ComboBoxMixin setRequired(boolean required) {
    return invoke(c -> c.setRequired(required));
  }

  default ComboBoxMixin setLabel(String label) {
    return invoke(c -> c.setLabel(label));
  }

  default ComboBoxMixin setPlaceholder(String placeholder) {
    return invoke(c -> c.setPlaceholder(placeholder));
  }

  default ComboBoxMixin setPattern(String pattern) {
    return invoke(c -> c.setPattern(pattern));
  }

  default ComboBoxMixin onEnabledStateChanged(boolean enabled) {
    return invoke(c -> c.onEnabledStateChanged(enabled));
  }


  default ComboBoxMixin addCustomValueSetListener(ComponentEventListener listener ,
                                                  Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addCustomValueSetListener(listener))
        .ifPresent(registrationConsumer);
    return this;
  }

  default ComboBoxMixin addCustomValueSetListener(ComponentEventListener listener) {
    component().map(component -> component.addCustomValueSetListener(listener));
    return this;
  }

}
