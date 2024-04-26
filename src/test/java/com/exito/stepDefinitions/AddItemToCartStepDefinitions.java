package com.exito.stepDefinitions;

import com.exito.tasks.SearchTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AddItemToCartStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Given("The user is able to access the exito store")
    public void theUserIsAbleToAccessTheExitoStore() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.exito.com/"),
                SearchTask.search()
        );
    }
    @When("The user search for the item and clicks the {string} button")
    public void theUserSearchForTheItemAndClicksTheButton() {
    }
    @Then("The item will be listed on the shopping cart list")
    public void theItemWillBeListedOnTheShoppingCartList() {
    }
}
