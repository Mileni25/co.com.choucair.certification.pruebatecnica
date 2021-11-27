package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.StepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FillStepThree implements Task {

    private String strYourComputer;
    private String strVersion;
    private String strLanguage;
    private String strMovilDevice;
    private String strModel;
    private String strOperatingSystem;

    public FillStepThree(String strYourComputer, String strVersion, String strLanguage, String strMovilDevice, String strModel, String strOperatingSystem) {
        this.strYourComputer = strYourComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMovilDevice = strMovilDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
    }

    public static FillStepThree toRegister(String strYourComputer, String strVersion, String strLanguage, String strMovilDevice, String strModel, String strOperatingSystem ) {
        return Tasks.instrumented(FillStepThree.class,strYourComputer,strVersion,strLanguage,strMovilDevice,strModel,strOperatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepThree.PUSH_COMPUTER),
                Enter.theValue(strYourComputer).into(StepThree.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_COMPUTER),
                Click.on(StepThree.PUSH_VERSION),
                Enter.theValue(strVersion).into(StepThree.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_VERSION),
                Click.on(StepThree.PUSH_LANGUAGE),
                Enter.theValue(strLanguage).into(StepThree.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_LANGUAGE),
                Click.on(StepThree.PUSH_MOVIL),
                Enter.theValue(strMovilDevice).into(StepThree.INPUT_MOVIL),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_MOVIL),
                Click.on(StepThree.PUSH_MODEL),
                Enter.theValue(strModel).into(StepThree.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_MODEL),
                Click.on(StepThree.PUSH_OPERATING),
                Enter.theValue(strOperatingSystem).into(StepThree.INPUT_OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(StepThree.INPUT_OPERATING_SYSTEM),
                Click.on(StepThree.BUTTON_NEXT_THREE));

    }
}
