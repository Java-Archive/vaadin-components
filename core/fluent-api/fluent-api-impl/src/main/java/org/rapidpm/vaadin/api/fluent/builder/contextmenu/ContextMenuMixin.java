package org.rapidpm.vaadin.api.fluent.builder.contextmenu;

import java.util.function.Consumer;

import org.rapidpm.vaadin.api.fluent.builder.api.ClickNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.layout.HasComponentsMixin;
import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;

public interface ContextMenuMixin
    extends
    HasComponentsMixin<ContextMenuMixin, ContextMenu>,
    HasStyleMixin<ContextMenuMixin, ContextMenu>,
    ClickNotifierMixin<ContextMenuMixin, ContextMenu>,
    ComponentMixin<ContextMenuMixin, ContextMenu> {


  default ContextMenuMixin addItem(String text , ComponentEventListener<ClickEvent<MenuItem>> clickListener ,
                                   Consumer<MenuItem> menuItemConsumer) {
    component()
        .map(c -> c.addItem(text , clickListener))
        .ifPresent(menuItemConsumer);
    return this;

  }

  default ContextMenuMixin addItem(Component component ,
                                   ComponentEventListener<ClickEvent<MenuItem>> clickListener ,
                                   Consumer<MenuItem> menuItemConsumer) {
    component()
        .map(c -> c.addItem(component , clickListener))
        .ifPresent(menuItemConsumer);
    return this;

  }
}
