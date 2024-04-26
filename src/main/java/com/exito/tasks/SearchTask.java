package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.exito.ui.HomeUI.TXT_SEARCHBAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_SEARCHBAR)
        );
    }

    public static SearchTask search(){
        return instrumented(SearchTask.class);
    }
}
