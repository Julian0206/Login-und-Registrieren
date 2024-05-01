package com.example.application.views.registrieren;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Registrieren")
@Route(value = "registrieren", layout = MainLayout.class)
@Uses(Icon.class)
public class RegistrierenView extends Composite<VerticalLayout> {

    public RegistrierenView() {
        H2 h2 = new H2();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        FormLayout formLayout2Col2 = new FormLayout();
        EmailField emailField = new EmailField();
        EmailField emailField2 = new EmailField();
        FormLayout formLayout2Col3 = new FormLayout();
        PasswordField passwordField = new PasswordField();
        PasswordField passwordField2 = new PasswordField();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h2.setText("Registrieren");
        h2.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, formLayout2Col);
        formLayout2Col.setWidth("100%");
        textField.setLabel("Vorname");
        textField.setWidth("min-content");
        textField2.setLabel("Nachname");
        textField2.setWidth("min-content");
        formLayout2Col2.setWidth("100%");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        emailField2.setLabel("Wiederhole Email");
        emailField2.setWidth("min-content");
        formLayout2Col3.setWidth("100%");
        passwordField.setLabel("Passwort");
        passwordField.setWidth("min-content");
        passwordField2.setLabel("Wiederhole Passwort");
        passwordField2.setWidth("min-content");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.START);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        buttonPrimary.setText("Registrieren");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h2);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(emailField);
        formLayout2Col2.add(emailField2);
        getContent().add(formLayout2Col3);
        formLayout2Col3.add(passwordField);
        formLayout2Col3.add(passwordField2);
        getContent().add(layoutColumn2);
        layoutColumn2.add(buttonPrimary);
    }
}
