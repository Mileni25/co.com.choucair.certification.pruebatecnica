package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.StepTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FillStepTwo implements Task {

    private String strCity;
    private String strPostalCode;
    private String strCountry;

    public FillStepTwo(String strCity, String strPostalCode, String strCountry) {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static FillStepTwo toRegister(String strCity, String strPostalCode, String strCountry) {
        return Tasks.instrumented(FillStepTwo.class,strCity,strPostalCode,strCountry);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(StepTwo.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(StepTwo.INPUT_CITY),
                Hit.the(Keys.ENTER).into(StepTwo.INPUT_CITY),
                Enter.theValue(strPostalCode).into(StepTwo.INPUT_POSTAL_CODE),
                //SelectFromOptions.byVisibleText(strCountry).from(StepTwo.INPUT_COUNTRY),
                Click.on(StepTwo.BUTTON_NEXT_TWO));
    }
}
