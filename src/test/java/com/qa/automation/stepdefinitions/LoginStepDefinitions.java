package com.qa.automation.stepdefinitions;

import com.qa.automation.tasks.Login;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("Tester").wasAbleTo();
    }

    @Cuando("ingresa el usuario {string} y la contraseña {string}")
    public void ingresaElUsuarioYLaContrasena(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @Entonces("deberia ver el mensaje de bienvenida {string}")
    public void deberiaVerElMensajeDeBienvenida(String message) {
        // Validacion con Screenplay Questions
    }
}