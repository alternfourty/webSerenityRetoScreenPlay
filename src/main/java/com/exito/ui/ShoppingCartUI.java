package com.exito.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartUI {
    public static Target SPAN_CARTITEMNAME = Target.the("Item Added in the cart").located(By.xpath("//span[@data-molecule-product-detail-name-span]"));
}
