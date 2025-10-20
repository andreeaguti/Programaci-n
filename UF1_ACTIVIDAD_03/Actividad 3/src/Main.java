import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1

        System.out.println("Ejercicio 2");
        Scanner sc = new Scanner(System.in);

        int dinero = 0;
        int dineroRestante = 0;
        int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0;

        do {
            System.out.println("Ingrese la cantidad de dinero, recuerde que debe ser multiplo de 5: ");
            dinero = sc.nextInt();
        } while (dinero % 5 != 0);

        String textoDinero = "Se necesitan n";
        dineroRestante = dinero;

        if (dineroRestante >= 500) {
            n500 = dineroRestante / 500;
            dineroRestante = dineroRestante - (n500 * 500);
            textoDinero = textoDinero + "\n" + n500 + " billetes de 500€";
        }
        if (dineroRestante >= 200) {
            n200 = dineroRestante / 200;
            dineroRestante = dineroRestante - (n200 * 200);
            textoDinero = textoDinero + "\n" + n200 + " billetes de 200€";
        }

        if (dineroRestante >= 100) {
            n100 = dineroRestante / 100;
            dineroRestante = dineroRestante - (n100 * 100);
            textoDinero = textoDinero + "\n" + n100 + " billetes de 100€";
        }

        if (dineroRestante >= 50) {
            n50 = dineroRestante / 50;
            dineroRestante = dineroRestante - (n50 * 50);
            textoDinero = textoDinero + "\n" + n50 + " billetes de 50€";
        }

        if (dineroRestante >= 20) {
            n20 = dineroRestante / 20;
            dineroRestante = dineroRestante - (n20 * 20);
            textoDinero = textoDinero + "\n" + n20 + " billetes de 20€";
        }

        if (dineroRestante >= 10) {
            n10 = dineroRestante / 10;
            dineroRestante = dineroRestante - (n10 * 10);
            textoDinero = textoDinero + "\n" + n10 + " billetes de 10€";
        }

        if (dineroRestante >= 5) {
            n5 = dineroRestante / 5;
            dineroRestante = dineroRestante - (n5 * 5);
            textoDinero = textoDinero + "\n" + n5 + " billetes de 5€";
        }

        System.out.println("El dinero total es: " + dinero);
        System.out.println("Se necesitan \n" + n500 + " billetes de 500"
                + "\n" + n200 + " billetes de 200"
                + "\n" + n100 + " billetes de 100"
                + "\n" + n50 + " billetes de 50"
                + "\n" + n20 + " billetes de 20"
                + "\n" + n10 + " billetes de 10"
                + "\n" + n5 + " billetes de 5");

        System.out.println("LA OTRA FORMA !!!!");
        System.out.println(textoDinero);
    }

    //Ejercicio 2

    double num1 = 0.0, num2 = 0.0;
    Scanner sc = new Scanner(System.in);
    String opcion = "5";

    do

    {
        sc = new Scanner(System.in);
        System.out.println("Ingrese la opcion del menu que desea realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                System.out.println("La suma de los dos numeros es: " + (num1 + num2));
                break;

            case "2":
                sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                System.out.println("La resta de los dos numeros es: " + (num1 - num2));
                break;

            case "3":
                sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                System.out.println("La multiplicacios de los dos numeros es: " + (num1 * num2));
                break;

            case "4":
                sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                if (num2 != 0.0) {
                    System.out.println("La division de los dos numeros es: " + (num1 / num2));
                } else {
                    System.out.println("NO se puede divir entre 0: ");
                }
                break;

            case "5":
                System.out.println("El programa se cerrara");
                break;

            default:
                System.out.println("Por favor escoja entre las opciones indicadas");
        }
    }while(!opcion.equals("5"));
}
}





