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
        sc=new Scanner(System.in);
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
        sc=new Scanner(System.in);
        System.out.println("Introduce longitud de radio: ");
        double radio = sc.nextDouble();
        double perimetro= 2 * Math.PI * radio;
        double areaC = Math.PI * radio * radio;
        double volumeE = (4/3) * Math.pow(radio,3)* Math.PI;
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area del radio es: " + areaC);
        System.out.println("El volumen es: " + volumeE);


        //Ejercicio 06
        System.out.println("Ejercicio 06");
        sc=new Scanner(System.in);
        System.out.println("Introduce el precio del articulo");
        double precio = sc.nextDouble();
        System.out.println("Introduce el precio de venta real");
        double precio2 = sc.nextDouble();
        double descuento = precio - precio2;
        double porcentaje = descuento / precio;
        double porcentaje2 = porcentaje * 100;
        System.out.println("El porcentaje de descuento es: " + porcentaje2 + "%");


        //Ejercicio 07
        System.out.println("Ejercicio 07");
        sc=new Scanner(System.in);
        System.out.println("Introduce distancia en millas marinas");
        double distancia = sc.nextDouble();
        double distancia2 = distancia * 1852;
        System.out.println("La distancia en metros es: " + distancia2);


        //Ejercicio 08
        System.out.println("Ejercicio 08");
        sc=new Scanner(System.in);
        System.out.println("Introduce primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Orden ascendente:" + Math.min(num1,num2) + "," + Math.max(num1,num2));


        //Ejercicio 09
        System.out.println("Ejercicio 09");
        sc=new Scanner(System.in);
        System.out.println("Introduce primer numero");
        double Num1 = sc.nextDouble();
        System.out.println("Introduce segundo numero");
        double Num2 = sc.nextDouble();
        System.out.println("Cual es mayor:" + Math.max(Num1,Num2));
        System.out.println("El numero es igual:" + (Num1 == Num2));


        //Ejercicio 10
        System.out.println("Ejercicio 10");
        sc=new Scanner(System.in);
        System.out.println("Introduce primer numero");
        double Núm1 = sc.nextDouble();
        System.out.println("Introduce segundo numero");
        double Núm2 = sc.nextDouble();
        System.out.println("Introduce tercer numero");
        double Núm3 = sc.nextDouble();
        double


























    }
}