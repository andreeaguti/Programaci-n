
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ejercicio 01
        System.out.println("Ejercicio 01");
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca su edad");
        int edad = sc.nextInt();
        //int se utiliza para numeros enteros y double para numeros con decimales
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }


        //Ejercicio 02
        System.out.println("Ejercicio 02");
        sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca sus anos");
        int anos = sc.nextInt();
        if (anos >= 18) {
            System.out.println ("Eres mayor de edad");
        }
        else if(anos > 18 && anos >= 0) {
            System.out.println ("Eres menor de edad");
        }
        else {
            System.out.println("La edad es invalida");
        }

        //Ejercicio 03
        System.out.println("Ejercicio 03");
        sc = new Scanner(System.in);

        for (int i = 1; i<=20; i++) {
            System.out.println("Los primeros 20 números naturales son:");
        }

        //Ejercicio 04
        System.out.println("Ejercicio 04");
        sc = new Scanner(System.in);

        for (int i = 2; i<=200; i += 2) {
            System.out.println("Los números pares entre el 1 y el 200 son:");
        }


        //Ejercicio 05
        System.out.println("Ejercicio 05");
        sc = new Scanner(System.in);

        for (int i = 2; i<=200; i++) {
            if ( i % 2 ==0) {
                System.out.println("El par es: "+i);
        }
        }

        //Ejercicio 06
        System.out.println("Ejercicio 06");
        sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();

        for (int i = 1; i<= numero; i++) {
            System.out.println("El numero natural es:" + i);
        }

        //Ejercicio 07
        System.out.println("Ejercicio 07");
        sc = new Scanner(System.in);

        System.out.println("Introduce la nota del alumno:");
        double nota = sc.nextDouble();

        if(nota < 0.0 || nota > 10.0) {
            System.out.println("La nota no puede ser negativa");
        }
        else if(nota < 3) {
            System.out.println("Muy deficiente");
        }
        else if(nota < 5) {
            System.out.println("Insuficiente");
        }
        else if(nota <6) {
            System.out.println("Bien");
        }
        else if (nota < 9) {
            System.out.println("Notable");
        }
        else if (nota <=10) {
            System.out.println("Sobresaliente");
        }

        //Ejercicio 08
        System.out.println("Ejercicio 08");
        sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num2 = sc.nextInt();

        //Factorial Ej num = 5 --> factorial = 5*4*3*2*1
        int factorial = 1;
        for (int i = 1; i <= num2; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es:" + factorial);

        //Ejercicio 09
        System.out.println("Ejercicio 09");
        sc = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();


        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();

        if (hora < 0 || minutos < 0 || segundos < 0) {
            System.out.println("Introduce un valor positivo: ");
        }
        if (hora >= 24 || minutos >= 60 || segundos >= 60) {
            System.out.println("Introduce un valor válido: ");
        }
        if (segundos == 59) {
            segundos = 0;
            minutos = minutos + 1;

        } else {
            segundos = segundos + 1;
        }
        if (minutos == 60) {
            minutos = 0;
            hora = hora + 1;
        } else {
            hora = hora + 1;
        }
        if (hora == 24) {
            hora = 0;
        }
        System.out.println("La hora transcurrido un segundo es:" + hora + ":" + minutos + ":" + segundos);

        //Ejercicio 10
        System.out.println("Ejercicio 10");
        sc = new Scanner(System.in);

        System.out.println("Introduce 10 números: ");

    }
}