package com.exito.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainUI {
    public static Target TXT_SEARCHBAR = Target.the("Search Field").located(By.xpath("//input[@aria-label='search']"));
    public static Target LINK_TO_ITEM = Target.the("Name of the item").located(By.xpath("//p[@class='styles_name__qQJiK']"));
    public static Target BTN_SHOPPINGCART = Target.the("Shopping Cart Icon").located(By.xpath("//button[@aria-label='Cart toggle button']"));
}
