package org.rapidpm.vaadin.addon.idgenerator;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.rapidpm.frp.functions.TriFunction;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.cookieconsent.CookieConsent;
import com.vaadin.flow.component.crud.Crud;
import com.vaadin.flow.component.customfield.CustomField;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.gridpro.GridPro;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.upload.Upload;

public interface VaadinIDGenerator {

  static TriFunction<Class, Class, String, String> genericID() {
    return (uiClass , componentClass , label)
        -> (uiClass.getSimpleName()
            + "-" + componentClass.getSimpleName()
            + "-" + label.replace(" " , "-"))
        .toLowerCase(Locale.US);
  }

  static Function<Class, BiFunction<Class, String, String>> typedComponentIDGenerator() {
    return (clazz) -> (uiClass , label) -> genericID().apply(uiClass , clazz , label);
  }


  static Function<String, String> caption() {
    return (id) -> id + "." + "caption";
  }

  static Function<String, String> placeholder() {
    return (id) -> id + "." + "placeholder";
  }


  static BiFunction<Class, String, String> gridID() {
    return (uiClass , label) -> genericID().apply(uiClass , Grid.class , label);
  }

  static BiFunction<Class, String, String> gridProID() {
    return (uiClass , label) -> genericID().apply(uiClass , GridPro.class , label);
  }

  static BiFunction<Class, String, String> buttonID() {
    return (uiClass , label) -> genericID().apply(uiClass , Button.class , label);
  }

  static BiFunction<Class, String, String> comboBoxID() {
    return (uiClass , label) -> genericID().apply(uiClass , ComboBox.class , label);
  }

  static BiFunction<Class, String, String> datePickerID() {
    return (uiClass , label) -> genericID().apply(uiClass , DatePicker.class , label);
  }

  static BiFunction<Class, String, String> labelID() {
    return (uiClass , label) -> genericID().apply(uiClass , Label.class , label);
  }

  static BiFunction<Class, String, String> spanID() {
    return (uiClass , label) -> genericID().apply(uiClass , Span.class , label);
  }

  static BiFunction<Class, String, String> textfieldID() {
    return (uiClass , label) -> genericID().apply(uiClass , TextField.class , label);
  }

  static BiFunction<Class, String, String> passwordID() {
    return (uiClass , label) -> genericID().apply(uiClass , PasswordField.class , label);
  }

  static BiFunction<Class, String, String> checkboxID() {
    return (uiClass , label) -> genericID().apply(uiClass , Checkbox.class , label);
  }

  static BiFunction<Class, String, String> contextMenuID() {
    return (uiClass , label) -> genericID().apply(uiClass , ContextMenu.class , label);
  }

  static BiFunction<Class, String, String> timePickerID() {
    return (uiClass , label) -> genericID().apply(uiClass , TimePicker.class , label);
  }

  static BiFunction<Class, String, String> detailsID() {
    return (uiClass , label) -> genericID().apply(uiClass , Details.class , label);
  }

  static BiFunction<Class, String, String> dialogID() {
    return (uiClass , label) -> genericID().apply(uiClass , Dialog.class , label);
  }

  static BiFunction<Class, String, String> selectID() {
    return (uiClass , label) -> genericID().apply(uiClass , Select.class , label);
  }

  static BiFunction<Class, String, String> iconID() {
    return (uiClass , label) -> genericID().apply(uiClass , Icon.class , label);
  }

  static BiFunction<Class, String, String> listBoxID() {
    return (uiClass , label) -> genericID().apply(uiClass , ListBox.class , label);
  }

  static BiFunction<Class, String, String> progressBarID() {
    return (uiClass , label) -> genericID().apply(uiClass , ProgressBar.class , label);
  }

  static BiFunction<Class, String, String> radioBtnGrpID() {
    return (uiClass , label) -> genericID().apply(uiClass , RadioButtonGroup.class , label);
  }
  static BiFunction<Class, String, String> tabID() {
    return (uiClass , label) -> genericID().apply(uiClass , Tab.class , label);
  }

  static BiFunction<Class, String, String> uploadID() {
    return (uiClass , label) -> genericID().apply(uiClass , Upload.class , label);
  }

  static BiFunction<Class, String, String> customFieldID() {
    return (uiClass , label) -> genericID().apply(uiClass , CustomField.class , label);
  }

  static BiFunction<Class, String, String> chartID() {
    return (uiClass , label) -> genericID().apply(uiClass , Chart.class , label);
  }

  static BiFunction<Class, String, String> richTextEditorID() {
    return (uiClass , label) -> genericID().apply(uiClass , RichTextEditor.class , label);
  }

  static BiFunction<Class, String, String> crudID() {
    return (uiClass , label) -> genericID().apply(uiClass , Crud.class , label);
  }

  static BiFunction<Class, String, String> cookieConsentID() {
    return (uiClass , label) -> genericID().apply(uiClass , CookieConsent.class , label);
  }

  static BiFunction<Class, String, String> confirmDialogID() {
    return (uiClass , label) -> genericID().apply(uiClass , ConfirmDialog.class , label);
  }


//  static BiFunction<Class, String, String> itemID() {
//    return (uiClass , label) -> genericID().apply(uiClass , Item.class , label);
//  }

//  static BiFunction<Class, String, String> accordeonID() {
//    return (uiClass , label) -> genericID().apply(uiClass , .class , label);
//  }

//  Layouts

  static BiFunction<Class, String, String> verticalLayoutID() {
    return (uiClass , label) -> genericID().apply(uiClass , VerticalLayout.class , label);
  }

  static BiFunction<Class, String, String> horizontalLayoutID() {
    return (uiClass , label) -> genericID().apply(uiClass , HorizontalLayout.class , label);
  }

  static BiFunction<Class, String, String> formLayoutID() {
    return (uiClass , label) -> genericID().apply(uiClass , FormLayout.class , label);
  }

  static BiFunction<Class, String, String> splitLayoutID() {
    return (uiClass , label) -> genericID().apply(uiClass , SplitLayout.class , label);
  }
}
