package com.example.application.views.login;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;

@PageTitle("Login")
@Route(value = "login", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class LoginView extends Composite<VerticalLayout> {

    public LoginView() {
        LoginForm loginForm = new LoginForm();
        Hr hr = new Hr();
        Paragraph textMedium = new Paragraph();
        RouterLink routerLink = new RouterLink();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, loginForm);
        loginForm.setWidth("min-content");
        textMedium.setText("Kein User? Registrieren Sie sich über den unten stehenden Link:");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textMedium);
        textMedium.setWidth("max-content");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        routerLink.setText("Registrieren");
        routerLink.setRoute(LoginView.class);
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, routerLink);
        routerLink.setWidth("min-content");
        getContent().add(loginForm);
        getContent().add(hr);
        getContent().add(textMedium);
        getContent().add(routerLink);
    }
}
