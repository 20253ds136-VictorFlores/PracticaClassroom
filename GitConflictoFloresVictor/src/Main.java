import java.util.Scanner;

public class Main {
    public static double DESCUENTO = 0.10;
    public static double UMBRAL_DESCUENTO = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculador de presupuesto sin IVA");
        double subtotal = pedirDouble(scanner, "Ingresa el valor del subtotal: ");

        double totalConDescuento = calcularDescuento(subtotal);

        if (subtotal > UMBRAL_DESCUENTO) {
            System.out.printf("El total a pagar con descuento es de: %.2f%n", totalConDescuento);
        } else {
            System.out.println("El precio no alcanzó el estándar de descuento.");
            System.out.printf("El total a pagar es de: %.2f%n", subtotal);
        }
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularDescuento(double subtotal) {
        if (subtotal > UMBRAL_DESCUENTO) {
            return subtotal - (subtotal * DESCUENTO);
        } else {
            return subtotal;
        }
    }
}