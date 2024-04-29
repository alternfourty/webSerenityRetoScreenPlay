package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.exito.ui.MainUI.BTN_SHOPPINGCART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenShoppingCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHOPPINGCART)
        );
    }

    public static Performable openCart(){
        return instrumented(OpenShoppingCart.class);
    }
}
