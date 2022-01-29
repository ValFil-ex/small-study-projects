/*
* Calculator Eingabebereich - Dezimalzahlen (Genauigkeit: 2 Kommastellen Dezimalzahlen (Genauigkeit: 2 Kommastellen -> mehr wird aufgerundet))
* aber <=MAX_INT und >=MIN_INT
*
* uÄk2: String -> input != !=("\\-?\\d*\\.?\\d+")
*   Repräsentant: 'SomeString'
*   TESTDATEN: 'SomeString'
*
*/


package Calculator_SWT.tests;

import Calculator_SWT.InputChecker;
import Calculator_SWT.MyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckerTest {
    InputChecker checker = new InputChecker();
    String input;
    Double expected;
    String errorMsg;

    @Test
    public void testInputAgainstString() {
        input = "SomeString";
        errorMsg = "Invalid input! Try again";

        try{
            checker.validateConsoleInput("SomeString");
            fail();
        }catch(MyException e){
            assertEquals(errorMsg, e.getMessage());
        }

        catch (Exception e){
            fail();
        }
    }

    @Test
    public void testValidInput(){
        input = "5.355";
        expected = 5.36;

        try{
            assertEquals(expected, checker.validateConsoleInput(input));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
