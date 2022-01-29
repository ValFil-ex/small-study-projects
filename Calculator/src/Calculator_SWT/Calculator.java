package Calculator_SWT;
//hier wird überprüft, ob die Zahl innerhalb des Eingabebereichs liegt
// (vom InputChecker zu Testzwecken entkoppelt)

public class Calculator {

    public double calculateAddition(double a, double b) throws Exception{
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if(a < min || b <min){
            throw new MyException("We cannot process numbers that small, try bigger numbers");
            //Calculator Eingabebereich - Dezimalzahlen (Genauigkeit: 2 Kommastellen), aber <=MAX_INT und >=MIN_INT
        }

        if(a>max || b>max){
            throw new MyException("We cannot process numbers that big, try smaller numbers");
            //Calculator Eingabebereich - Dezimalzahlen (Genauigkeit: 2 Kommastellen), aber <=MAX_INT und >=MIN_INT
        }

        return a+b;
    }


}
