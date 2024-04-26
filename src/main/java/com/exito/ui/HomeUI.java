package com.exito.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static Target TXT_SEARCHBAR = Target.the("Search Field").located(By.xpath("//a[@aria-label='search']"));
}
