import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /** Realiza un programa que muestre un menú de opciones como el siguiente:
         1. Sumar
         2. Restar
         3. Multiplicar
         4. Dividir (incluir manejo de división por 0)
         5. Salir
         El menú debe de repetirse hasta que se escoja la opción 5 (Salir). **/

        System.out.println("Ejercicio 2");

        double num1 = 0.0, num = 0.0;
        Scanner sc = new Scanner(System.in);
        String opcion = "5";

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce el primer numero");
                    num1


            }
        } while(!opcion.equals("5"));





