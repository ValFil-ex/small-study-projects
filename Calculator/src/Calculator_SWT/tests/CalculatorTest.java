/*
* Calculator Eingabebereich - Dezimalzahlen (Genauigkeit: 2 Kommastellen Dezimalzahlen (Genauigkeit: 2 Kommastellen -> mehr wird aufgerundet))
* aber <=MAX_INT und >=MIN_INT
*
+ gÄK1: [-2147483648 … 2147483647]
*   Repräsentant: 15.22, -200
*   Grenzwerte: 2147483647, -2147483648
*   TESTDATEN: 15.22, -200, 2147483647, -2147483648, 2147483647.01, -2147483648.01, 2147483646.99, -2147483647.99
*
* uÄK1: ]-2147483648.01 … 2147483647.01[
*   Repräsentant: -2147483648.01
*   TESTDATEN: -2147483648.01 (=benachbarter Grenzwert aus dem gÄk1)
*
* uÄk2: String -> input != !=("\\-?\\d*\\.?\\d+")
*   Repräsentant: 'SomeString'
*   TESTDATEN: 'SomeString'
* (wird im InputCheckerTest getestet)
*
*/


package Calculator_SWT.tests;

import Calculator_SWT.Calculator;
import Calculator_SWT.MyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    double a;
    double b;
    double result;
    double expected;

    //gÄK1: [-2147483648 … 2147483647] - Repräsentanten
    @Test
    void AddRepresValues() {
        a = 15.22;
        b = -200;
        expected = -184.78;

        try{
            assertEquals(expected, calc.calculateAddition(a,b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //gÄK1: [-2147483648 … 2147483647] - Max Grenzwerte
    //hiermit wird max Eingabewert sowie ein max Ausgabewwert getestet
    // wird überprüft, ob die Funktion mit maximal möglichen Werten wie erwartet funktioniert
    @Test
    void AddMaxAndMax (){
        a = 2147483647;
        b = a;
        expected = 4294967294.00;

        try{
            assertEquals(expected, calc.calculateAddition(a, b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    //gÄK1: [-2147483648 … 2147483647] - Min Grenzwerte
    //hiermit wird min Eingabewert sowie min Ausgabewwert getestet
    // wird überprüft, ob die Funktion mit minimal möglichen Werten wie erwartet funktioniert
    @Test
    void AddMinandMin (){
        a = -2147483648;
        b = a;
        expected = -4294967296.00;

        try{
            assertEquals(expected, calc.calculateAddition(a, b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //gÄK1: [-2147483648 … 2147483647] - x < max Grenzwert (gültig)
    @Test
    void AddBelowBorderValuePositive (){
        a = 2147483646.99;
        b = 10;
        expected = 2147483656.99;
        try{
            assertEquals(expected, calc.calculateAddition(a, b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //gÄK1: [-2147483648 … 2147483647] - x > min Grenzwert (gültig)
    @Test
    void AddBelowBorderValueNegative (){
        a = -2147483647.99;
        b = -5;
        expected = -2147483652.99;
        try{
            assertEquals(expected, calc.calculateAddition(a, b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //gÄK1: [-2147483648 … 2147483647] x > max Grenzwert (ungültig) = uÄK1
    @Test
    void AddAboveBorderValuePositive (){
        a = 2147483647.01;
        b = 243;

        String errMsg = "We cannot process numbers that big, try smaller numbers";

        try{
            result = calc.calculateAddition(a,b);
            fail();
        }catch (MyException e){
            assertEquals(errMsg, e.getMessage());
        }

        catch (Exception e){
            fail();
        }
    }

    //gÄK1: [-2147483648 … 2147483647] - x < min Grenzwert (ungültig) = uÄK1
    @Test
    void AddAboveBorderValueNegative (){
        a = -2147483648.01;
        b = 18;

        String errMsg = "We cannot process numbers that small, try bigger numbers";

        try{
            result = calc.calculateAddition(a,b);
            fail();
        }catch (MyException e){
            assertEquals(errMsg, e.getMessage());
        }

        catch (Exception e){
            fail();
        }
    }





}
