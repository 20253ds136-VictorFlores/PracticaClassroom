import java.util.Scanner;

public class Main {

    public static double IVA = 0.16;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculador de presupuesto con IVA");
        double subtotal = pedirDouble(scanner, "Ingresa el valor del subtotal para calcular el IVA: ");
        double [] totalFinal = obtenerIVA(subtotal);

        System.out.printf("El valor del IVA es de: %.2f%n", totalFinal[0]);
        System.out.printf("El total a pagar: %.2f%n", totalFinal[1]);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double[] obtenerIVA(double subtotal) {
        double valorDeIVA = subtotal * IVA;
        double valorConIVA = valorDeIVA + subtotal;
        return new double[]{valorDeIVA, valorConIVA};
    }
}