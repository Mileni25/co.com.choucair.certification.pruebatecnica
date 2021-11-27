package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.StepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillStepOne implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strDateMonth;
    private String strDateDay;
    private String strDateYear;

    public FillStepOne(String strFirstName, String strLastName, String strEmailAddress, String strDateMonth, String strDateDay, String strDateYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strDateMonth = strDateMonth;
        this.strDateDay = strDateDay;
        this.strDateYear = strDateYear;
    }

    public static FillStepOne toRegister(String strFirstName, String strLastName, String strEmailAddress, String strDateMonth, String strDateDay, String strDateYear) {
            return Tasks.instrumented(FillStepOne.class, strFirstName, strLastName, strEmailAddress, strDateMonth, strDateDay, strDateYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(StepOne.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(StepOne.INPUT_LASTNAME),
                Enter.theValue(strEmailAddress).into(StepOne.INPUT_EMAILADDRESS),
                SelectFromOptions.byVisibleText(strDateMonth).from(StepOne.INPUT_DATEMONTH),
                SelectFromOptions.byVisibleText(strDateDay).from(StepOne.INPUT_DATEDAY),
                SelectFromOptions.byVisibleText(strDateYear).from(StepOne.INPUT_DATEYEAR),
                Click.on(StepOne.BUTTON_NEXT));
    }
}
