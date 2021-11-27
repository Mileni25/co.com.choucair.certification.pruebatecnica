package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.pruebaTecnicaData;
import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user wants to register$")
    public void thatTheUserWantsToRegister() {
        OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }

    @When("^the user fill out the form$")
    public void theUserFillOutTheForm(List<pruebaTecnicaData> data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(FillStepOne.toRegister(data.get(0).getStrFirstName(),
                data.get(0).getStrLastName(),data.get(0).getStrEmailAddress(),data.get(0).getStrDateMonth(),
                data.get(0).getStrDateDay(),data.get(0).getStrDateYear()),FillStepTwo.toRegister(data.get(0).getStrCity(),
                data.get(0).getStrPostalCode(),data.get(0).getStrCountry()), FillStepThree.toRegister(data.get(0).getStrYourComputer(),
                data.get(0).getStrVersion(),data.get(0).getStrLanguage(),data.get(0).getStrMovilDevice(),data.get(0).getStrModel(),
                data.get(0).getStrOperatingSystem()),FillStepFour.toRegister(data.get(0).getStrPassword(),data.get(0).getStrConfirmPassword()));
    }

    @Then("^user successfully registers$")
    public void userSuccessfullyRegisters(List<pruebaTecnicaData> data) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data.get(0).getStrVerif())));

    }
}
