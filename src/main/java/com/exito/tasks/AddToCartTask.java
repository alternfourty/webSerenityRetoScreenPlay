package com.exito.tasks;

import com.exito.interactions.SelectFirstItem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.exito.ui.SearchResultsUI.BTN_ADDITEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADDITEM, WebElementStateMatchers.isClickable()),
                SelectFirstItem.click());
    }

    public static Performable selectItem(){
        return instrumented(AddToCartTask.class);
    }
}
