package co.com.choucair.certification.pruebatecnica.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepTwo {

    public static final Target INPUT_CITY = Target.the("llenar la ciudad").
            located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("llenar el codigo postal").
            located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("llenar el pais").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target BUTTON_NEXT_TWO = Target.the("Boton que continua la pagina").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
