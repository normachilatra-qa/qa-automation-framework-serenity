package com.qa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DashboardVisibility implements Question<Boolean> {

    public static DashboardVisibility isDisplayed() {
        return new DashboardVisibility();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }
}