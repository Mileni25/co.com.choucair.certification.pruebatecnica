package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.StepFour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strVerif;

    public Answer(String strVerif) {
        this.strVerif = strVerif;
    }

    public static Answer toThe(String strVerif) {
        return new Answer(strVerif);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Confirm = Text.of(StepFour.VERIF).viewedBy(actor).asString();
        if(strVerif.equals(Confirm)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
