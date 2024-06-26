package com.exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AddItemToCart",
        glue = "com.exito.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class Runner {

}
