package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.StepFour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillStepFour implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public FillStepFour(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static FillStepFour toRegister(String strPassword,String strConfirmPassword) {
        return Tasks.instrumented(FillStepFour.class, strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(StepFour.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(StepFour.INPUT_CONFIRM_PASSWORD),
                Click.on(StepFour.BUTTON_TERMS),
                Click.on(StepFour.BUTTON_PRIVACY),
                Click.on(StepFour.BUTTON_NEXT_FOUR));

    }
}
