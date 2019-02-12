package org.rapidpm.vaadin.api.fluent.builder.contextmenu;

import java.util.function.Supplier;

import org.rapidpm.frp.model.Result;
import org.rapidpm.vaadin.api.fluent.builder.ComponentHolder;
import com.vaadin.flow.component.contextmenu.ContextMenu;

public class ContextMenuBuilder
    extends ComponentHolder<ContextMenu>
    implements ContextMenuMixin {

  public ContextMenuBuilder(Result<ContextMenu> component) {
    super(component);
  }

  public ContextMenuBuilder(Supplier<ContextMenu> supplier) {
    super(supplier);
  }
}
