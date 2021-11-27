@stories
  Feature: register at utest.com

    @scenario1
    Scenario: fill out the form
    Given that the user wants to register
    When the user fill out the form

      |strFirstName | strLastName   | strEmailAddress         | strDateMonth | strDateDay | strDateYear| strCity | strPostalCode| strCountry| strYourComputer| strVersion | strLanguage| strMovilDevice| strModel| strOperatingSystem| strPassword         | strConfirmPassword |
      |Diana Milena | Torres Rondon | dianamil_96@hotmail.com | October      | 25         | 1996       | Cúcuta  | 541030       | Colombia  | Windows        | Windows 10 | English    | Motorola      | Moto G30| Android 11        | @DianaM.Torres_1125 | @DianaM.Torres_1125|

    Then user successfully registers

      | strVerif       |
      | The last step  |

