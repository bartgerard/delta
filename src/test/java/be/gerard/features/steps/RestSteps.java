package be.gerard.features.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

/**
 * RestSteps
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class RestSteps {

    @Step
    public void whenPing() {
        SerenityRest.rest().get("ping");
    }

    @Step
    public void thenCheckOutcome() {
        SerenityRest.then().body("app", Matchers.is("delta"));
    }

}
