package org.rapidpm.vaadin.api.fluent.builder.api.layout;

import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexComponent;

public interface FlexComponentMixin<R extends FlexComponentMixin, T extends FlexComponent>
    extends
    HasOrderedComponentsMixin<R, T>,
    HasStyleMixin<R, T>,
    HasSizeMixin<R, T> {

  default R setAlignItems(FlexComponent.Alignment alignment) {
    return invoke(c -> c.setAlignItems(alignment));
  }

  default R setAlignSelf(FlexComponent.Alignment alignment , HasElement... elementContainers) {
    return invoke(c -> c.setAlignSelf(alignment , elementContainers));
  }

  default R setFlexGrow(double flexGrow , HasElement... elementContainers) {
    return invoke(c -> c.setFlexGrow(flexGrow , elementContainers));
  }

  default R setJustifyContentMode(FlexComponent.JustifyContentMode justifyContentMode) {
    return invoke(c -> c.setJustifyContentMode(justifyContentMode));
  }

  default R expand(Component... componentsToExpand) {
    return invoke(c -> c.expand(componentsToExpand));
  }

  default R replace(Component oldComponent , Component newComponent) {
    return invoke(c -> c.replace(oldComponent , newComponent));
  }

}
