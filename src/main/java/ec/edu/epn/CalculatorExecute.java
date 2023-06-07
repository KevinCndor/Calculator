package ec.edu.epn;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("--------------- Calculator -------------------");

        Calculator c = new Calculator();
        int addition = c.suma(17,58);
        System.out.println("Addition: " + addition);
        System.out.println("");

        int subtraction = c.resta(70,35);
        System.out.println("Substraction: " + subtraction);
        System.out.println("");

        int multiplication = c.multiplicacion(7,45);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("");

        int division = c.division(64,8);
        System.out.println("Division: " + division);
        System.out.println("");
    }
}