
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ejercicio 01
        System.out.println("Ejercicio 01");
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca su edad");
        double edad = sc.nextDouble();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        //Ejercicio 02
        System.out.println("Ejercicio 02");
        sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca sus anos");
        double anos = sc.nextDouble();
        if (anos >= 18) {
            System.out.println ("Eres mayor de edad");
        }
        else if(anos < 18) {
            System.out.println ("Eres menor de edad");
        }

        //Ejercicio 03
        System.out.println("Ejercicio 03");
        sc = new Scanner(System.in);

        System.out.println("Los primeros 20 números naturales son:");
        for (int i = 1; i<=20; i++) {
            System.out.println(i);

        }

        //Ejercicio 04
        System.out.println("Ejercicio 04");
        sc = new Scanner(System.in);

        System.out.println("Los números pares entre el 1 y el 200 son:");


        }









    }
}