import java.util.Scanner;

public class T1_C2_Silva {

    static double promedio(double a, double b, double c) {

        return (a + b + c) / 3;
    }

    static String estado(double nota) {

        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    static double necesitaEnSupletorio(double nota) {

        return 28 - nota;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double c = sc.nextDouble();

        double notaFinal = promedio(a, b, c);

        System.out.println("\n----- RESULTADOS -----");

        System.out.printf("Promedio: %.2f%n", notaFinal);

        System.out.println("Estado: " + estado(notaFinal));

        if (notaFinal >= 9 && notaFinal < 14) {

            System.out.printf(
                "Nota mínima del supletorio: %.2f%n",
                necesitaEnSupletorio(notaFinal)
            );
        }

        sc.close();
    }
}