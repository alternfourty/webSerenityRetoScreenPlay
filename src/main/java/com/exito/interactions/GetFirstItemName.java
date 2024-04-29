package com.exito.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import static com.exito.ui.MainUI.LINK_TO_ITEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetFirstItemName implements Interaction,Performable {
    public static String itemName = "";
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> itemNameList = LINK_TO_ITEM.resolveAllFor(actor);
        WebElementFacade item = itemNameList.get(0);
        itemName = item.getText();
    }
    public static Performable getName() {
        return instrumented(GetFirstItemName.class);
    }
}
