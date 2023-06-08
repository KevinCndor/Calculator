package ec.edu.epn;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("--------------- Calculator -------------------");

        Calculator c = new Calculator();
        System.out.println("");

        int subtraction = c.resta(70,35);
        System.out.println("");

        int multiplication = c.multiplicacion(7,45);
        System.out.println("");

        int division = c.division(64,8);
        System.out.println("");

        double sqrt = c.raizCuadrada(121);
    }
}