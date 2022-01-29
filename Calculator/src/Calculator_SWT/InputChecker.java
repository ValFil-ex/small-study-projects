package Calculator_SWT;

import java.math.BigDecimal;
import java.math.RoundingMode;

//hier wird überprüft, ob eine Zahl eingegeben wurde
// Eingabe wird für den Kalkulator vorbereitet (aufgerundet)

public class InputChecker {

    public double validateConsoleInput(String input) throws Exception {

        //Calculator Eingabebereich - Dezimalzahlen (Genauigkeit: 2 Kommastellen), aber <=MAX_INT und >=MIN_INT

        double trimmedInput;
        double rawInput;

        if(input.matches("\\-?\\d*\\.?\\d+")){
            rawInput = Double.parseDouble(input);
            trimmedInput = roundToTwoPrecisionPoints(rawInput);
            return trimmedInput;
        }throw new MyException("Invalid input! Try again");

    }

    private double roundToTwoPrecisionPoints(double value){
        return new BigDecimal(value).setScale(2, RoundingMode.UP).doubleValue();
    }
}
