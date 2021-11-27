package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThree {

    public static final Target PUSH_COMPUTER = Target.the("selleciona tipo computadora").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER = Target.the("Ingresar tipo computadora").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target PUSH_VERSION = Target.the("selecionar el tipo de version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("ingresa  la version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target PUSH_LANGUAGE = Target.the("selleciona tipo de lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAGE = Target.the("selecciona el lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target PUSH_MOVIL = Target.the("selleciona tipo de telefono").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOVIL = Target.the("selecciona el tipo de telefono").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target PUSH_MODEL = Target.the("selleciona tipo de modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("seleciona el tipo de modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target PUSH_OPERATING = Target.the("selleciona tipo de modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("seleciona el tipo de sistema operativo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT_THREE = Target.the("Boton pagina que sigue").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
