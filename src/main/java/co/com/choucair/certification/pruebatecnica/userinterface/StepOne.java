package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepOne {
    public static final Target INPUT_FIRSTNAME = Target.the("Llenar los nombres").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Llenar los apellidos").
            located(By.id("lastName"));
    public static final Target INPUT_EMAILADDRESS = Target.the("Llenar el correo").
            located(By.id("email"));
    public static final Target INPUT_DATEMONTH = Target.the("Llenar el mes").
            located(By.id("birthMonth"));
    public static final Target INPUT_DATEDAY = Target.the("Llenar el dia").
            located(By.id("birthDay"));
    public static final Target INPUT_DATEYEAR = Target.the("Llenar el año").
            located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Boton que continua").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}

