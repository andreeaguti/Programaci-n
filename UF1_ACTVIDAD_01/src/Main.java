import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("Ejercicio 01");
        System.out.println("Buenos días futuros programadores");

        // Ejercicio 2
        System.out.println("Ejercicio 02");
        double lado = 5;
        double area = lado * lado;
        System.out.println("lado: " + lado);
        System.out.println("area: " + area);

        // Ejercicio 3
        System.out.println("Ejercicio 03");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2= lado2*lado2;
        System.out.println("lado: " + lado2);
        System.out.println("area: " + area2);

        //Ejercicio 4
        System.out.println("Ejercicio 04");
        System.out.println("Introduce el primer numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double numero2 = sc.nextDouble();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

        //Ejercicio 05
        System.out.println("Ejercicio 05");
        System.out.println("Introduce longitud de radio: ");
        double radio = sc.nextDouble();

    }
}