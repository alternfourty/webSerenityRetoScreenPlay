package com.exito.questions;

import com.exito.interactions.GetFirstItemName;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Objects;

import static com.exito.ui.ShoppingCartUI.SPAN_CARTITEMNAME;

public class CheckCart implements Question<Boolean> {
    public Boolean answeredBy(Actor actor) {
        WebElementFacade itemInCart = SPAN_CARTITEMNAME.resolveFor(actor);
        return Objects.equals(itemInCart.getText(), GetFirstItemName.itemName);
    }
    public static Question<Boolean> itemExistsInTheCart(){
        return new CheckCart();
    }
}
