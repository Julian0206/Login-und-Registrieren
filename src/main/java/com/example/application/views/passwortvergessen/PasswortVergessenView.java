package com.example.application.views.passwortvergessen;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("PasswortVergessen")
@Route(value = "passwortVergessen", layout = MainLayout.class)
@Uses(Icon.class)
public class PasswortVergessenView extends Composite<VerticalLayout> {

    public PasswortVergessenView() {
        H2 h2 = new H2();
        Paragraph textMedium = new Paragraph();
        EmailField emailField = new EmailField();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        h2.setText("Passwort Vergessen?");
        h2.setWidth("max-content");
        textMedium.setText(
                "Bitte tragen Sie Ihre E-Mail-Adresse in das Textfeld ein und klicken Sie auf 'Code anfordern'. Dadurch wird Ihnen ein Reset-Code für Ihr Passwort zugesendet.");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textMedium);
        textMedium.setWidth("max-content");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        buttonPrimary.setText("Code anfordern");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h2);
        getContent().add(textMedium);
        getContent().add(emailField);
        getContent().add(buttonPrimary);
    }
}
