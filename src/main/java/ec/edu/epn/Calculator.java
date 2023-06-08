package ec.edu.epn;

public class Calculator {
    public int suma(int num1, int num2){
        System.out.println("Addition: " + num1 + " + " + num2 + " = "+ (num1+num2));
        return num2 + num1;
    }

    public int resta(int num1, int num2){
        System.out.println("Substraction: " + num1 + " - " + num2 + " = " + (num1-num2));
        return num1 - num2;
    }

    public int multiplicacion(int num1, int num2){
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1*num2));
        return num1 * num2;
    }

    public int division(int num1, int num2){
        System.out.println("Division: " + num1 + "/" + num2 + " = " + (num1/num2));
        return  num1 / num2;
    }

    /* Nueva cambio(operación raíz cuadrada)*/
    public double raizCuadrada(int num){
        System.out.println("Square root: sqrt(" + num + ") = " + (Math.sqrt(num)));
        return Math.sqrt(num);
    }
}
