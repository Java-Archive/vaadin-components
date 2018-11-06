package org.rapidpm.vaadin.api.i18n;

import java.util.Locale;

import org.rapidpm.frp.functions.CheckedTriFunction;
import com.vaadin.flow.i18n.I18NProvider;

public interface TitleFormatter extends CheckedTriFunction<I18NProvider, Locale, String, String> {
}
