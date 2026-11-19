import java.util.Scanner;

public class T1_C1_Silva{

    static double leerConsumo(Scanner sc) {

        double m3;

        do {
            System.out.print("Ingrese el consumo de agua en m3: ");
            m3 = sc.nextDouble();

            if (m3 < 0) {
                System.out.println("Error: el consumo no puede ser negativo.");
            }

        } while (m3 < 0);

        return m3;
    }

    static double calcularValor(double m3) {

        double valor;

        if (m3 <= 15) {
            valor = m3 * 0.40;
        } else {
            valor = (15 * 0.40) + ((m3 - 15) * 0.75);
        }

        valor = valor + 2.50;

        return valor;
    }

    static void mostrarPlanilla(double m3, double valor) {

        System.out.println("\n----- PLANILLA DE AGUA -----");
        System.out.println("Consumo: " + m3 + " m3");
        System.out.printf("Total a pagar: $%.2f%n", valor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double consumo = leerConsumo(sc);
        double total = calcularValor(consumo);

        mostrarPlanilla(consumo, total);

        sc.close();
    }
}