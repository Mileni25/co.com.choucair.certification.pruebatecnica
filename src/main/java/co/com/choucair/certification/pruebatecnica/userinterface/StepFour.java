package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StepFour {

    public static final Target INPUT_PASSWORD = Target.the("Llenar contraseña").
            located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirmar la contraseña").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target BUTTON_TERMS = Target.the("seleccionar terminos").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target BUTTON_PRIVACY = Target.the("Seleccionar privacidady terminos").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_NEXT_FOUR = Target.the("boton para finalizar el registro").
            located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
    public static final Target VERIF = Target.the("Verificaion").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
