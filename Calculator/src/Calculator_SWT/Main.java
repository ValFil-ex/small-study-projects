/*Nach Rücksprache mit dem Auftraggeber wurde festgelegt, dass der Eingabebereich wie folgt sein soll:
- Dezimalzahlen (Genauigkeit: 2 Kommastellen);
-  MIN_INT<= a<=MAX_INT*/

package Calculator_SWT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to calculator");
        InputChecker checker = new InputChecker();
        Calculator calculator = new Calculator();


        try{
            System.out.println("Please enter your first number: ");
            String input = sc.nextLine();
            a = checker.validateConsoleInput(input);
            System.out.printf("you entered : %.2f \n", a);

            System.out.println("Please enter your second number: ");
            input = sc.nextLine();
            b = checker.validateConsoleInput(input);
            System.out.printf("you entered : %.2f \n", b);

            c = calculator.calculateAddition(a, b);
            System.out.printf("The result is: %.2f + %.2f = %.2f \n", a,b,c);
        }catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }


}

