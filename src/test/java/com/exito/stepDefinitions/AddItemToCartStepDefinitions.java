package com.exito.stepDefinitions;

import com.exito.interactions.GetFirstItemName;
import com.exito.questions.CheckCart;
import com.exito.tasks.AddToCartTask;
import com.exito.tasks.OpenShoppingCart;
import com.exito.tasks.SearchTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
                Open.url("https://www.exito.com/")
        );
    }
    @When("The user search for the item and clicks the agregar button")
    public void theUserSearchForTheItemAndClicksTheButton() {
        theActorCalled("User").wasAbleTo(
                SearchTask.search(),
                AddToCartTask.selectItem());
    }
    @Then("The item will be listed on the shopping cart list")
    public void theItemWillBeListedOnTheShoppingCartList() {
        theActorCalled("User").wasAbleTo(
                GetFirstItemName.getName(),
                OpenShoppingCart.openCart()
        );
        theActorCalled("User").should(
                seeThat(
                        CheckCart.itemExistsInTheCart(), Matchers.equalTo(true)
                )
        );
    }
}
