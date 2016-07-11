package be.gerard.features;

import be.gerard.features.steps.RestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.rest.rules.RestConfigurationAction;
import net.serenitybdd.rest.rules.RestConfigurationRule;
import net.thucydides.core.annotations.Steps;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * be.gerard.features.WhenRest
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RunWith(SerenityRunner.class)
public class WhenRest {

    @Rule
    public RestConfigurationRule rule = new RestConfigurationRule((RestConfigurationAction) () -> SerenityRest.setDefaultBasePath("rest/games"));

    @Steps
    private RestSteps restSteps;

    @Test
    public void test() {
        // WHEN
        restSteps.whenPing();

        // THEN
        restSteps.thenCheckOutcome();
    }

}
