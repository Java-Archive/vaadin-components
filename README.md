Component Login - [![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/rapidpm-vaadin-component---login)
[![Stars on Vaadin Directory](https://img.shields.io/vaadin-directory/star/rapidpm-vaadin-component---login.svg)](https://vaadin.com/directory/component/rapidpm-vaadin-component---login)
  
Component Fluent API - [![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/rapidpm-vaadin-fluent-component-api)
[![Stars on Vaadin Directory](https://img.shields.io/vaadin-directory/star/rapidpm-vaadin-fluent-component-api.svg)](https://vaadin.com/directory/component/rapidpm-vaadin-fluent-component-api) 


# vaadin-components
A collection of Vaadin components

<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>

# Vaadin Components and more
This is the wiki for the Vaadin Components.

## Changelog / Version
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.rapidpm.vaadin/vaadin-components/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.rapidpm.vaadin/vaadin-components)


### 00.02.00-RPM
* Fluent API
    * added the possibility to add ClickListener. The registration can be consumed via Consumer.
        * addClickListener(ComponentEventListener<ClickEvent<T>> listener, Consumer<Registration> registrationConsumer)
        * addDetachListener(ComponentEventListener<ClickEvent<T>> listener, Consumer<Registration> registrationConsumer)
        * addAttachListener(ComponentEventListener<ClickEvent<T>> listener, Consumer<Registration> registrationConsumer)
    * added the possibility to add ClickListener without Registration consumer
        * addClickListener(ComponentEventListener<ClickEvent<T>> listener)
        * addDetachListener(ComponentEventListener<ClickEvent<T>> listener)
        * addAttachListener(ComponentEventListener<ClickEvent<T>> listener)
    * HorizontalLayoutMixin addComponents(Component... components)
    * VerticalLayoutMixin addComponents(Component... components)


### 00.01.00-RPM
* Fluent API
    * Component - the generic version
    * TextField
    * PasswordField
    * Button
    * Checkbox
    * VerticalLayout
    * HorizontalLayout

* Component Login
    * initial import / first version

## Component Fluent API
The missing Fluent API for Vaadin 10 Components.
Documentation is : [Component-Fluent-API.md](Component-Fluent-API.md)

## Component - Login
The boring but useful Login Component
Documentation is : [Component-Login.md](Component-Login.md)


