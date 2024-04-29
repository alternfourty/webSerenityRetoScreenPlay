package com.exito.tasks;

import com.exito.utils.ExcelRead;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static com.exito.ui.MainUI.TXT_SEARCHBAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<Map<String, String>> excelData;

        try {
            excelData = ExcelRead.readExcel("src/test/resources/Data/dataFile2.xlsx", "registry");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(TXT_SEARCHBAR),
                Enter.theValue(excelData.get(0).get("itemName")).into(TXT_SEARCHBAR).thenHit(Keys.ENTER)
        );
    }

    public static Performable search(){
       return instrumented(SearchTask.class);
    }
}
