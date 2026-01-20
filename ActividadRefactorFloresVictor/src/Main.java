import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de suma y Promedio");
        int valorNumero1 = pedirDatos(scanner, "Ingresa el primero valor(Debe ser un valor entero):");
        int valorNumero2 = pedirDatos(scanner, "Ingresa el segundo valor(Debe ser un valor entero):");
        int valorNumero3 = pedirDatos(scanner, "Ingresa el tercer valor(Debe ser un valor entero):");

        double [] resultado = calculoDeDatos(valorNumero1, valorNumero2, valorNumero3);
        System.out.println("La suma de todos los datos es de: "+resultado[0]);
        System.out.println("El promedio de todos los datos es de: "+resultado[1]);
    }

    public static int pedirDatos(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static double[] calculoDeDatos(int valorNumero1, int valorNumero2, int valorNumero3) {
        double suma = valorNumero1 + valorNumero2 + valorNumero3;
        double promedio = suma / 3.0;
        return new double[]{suma, promedio};
    }
}