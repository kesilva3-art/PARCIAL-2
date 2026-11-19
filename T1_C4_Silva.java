import java.util.Scanner;

public class T1_C4_Silva{

    // Contar los digitos
    static int contarDigitos(int n) {

        int contador = 0;

        do {
            contador++;
            n = n / 10;

        } while (n > 0);

        return contador;
    }

    // Calcular potencia sin Math.pow
    static int potencia(int b, int e) {

        int resultado = 1;

        for (int i = 1; i <= e; i++) {

            resultado = resultado * b;
        }

        return resultado;
    }

    // Comprobar si es Armstrong
    static boolean esArmstrong(int n) {

        if (n < 0) {
            return false;
        }

        int cantidad = contarDigitos(n);
        int original = n;
        int suma = 0;

        do {

            int digito = n % 10;

            suma = suma + potencia(digito, cantidad);

            n = n / 10;

        } while (n > 0);

        return suma == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (esArmstrong(numero)) {

            System.out.println("El numero es Armstrong.");

        } else {

            System.out.println("El numero no es Armstrong.");
        }

        sc.close();
    }
}