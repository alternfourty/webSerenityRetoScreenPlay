package com.exito.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.util.List;

import static com.exito.ui.SearchResultsUI.BTN_ADDITEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstItem implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> itemAddButtonList = BTN_ADDITEM.resolveAllFor(actor);
        WebElementFacade addButton = itemAddButtonList.get(0);
        addButton.click();
    }

    public static Performable click() {
        return instrumented(SelectFirstItem.class);
    }
}
