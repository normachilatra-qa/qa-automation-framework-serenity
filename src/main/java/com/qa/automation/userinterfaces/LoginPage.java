package com.qa.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USER_INPUT = Target.the("Campo de usuario")
            .located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = Target.the("Campo de contraseña")
            .located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Boton de inicio de sesion")
            .located(By.id("login-button"));
}