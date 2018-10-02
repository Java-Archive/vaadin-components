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
    * added the possibility to add ClickListener without Registration cunsumer
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
The boring but usefull Login Component
Documentation is : [Component-Login.md](Component-Login.md)