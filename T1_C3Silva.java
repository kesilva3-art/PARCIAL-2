import java.util.Scanner;

public class T1_C3_Apellido {
    static double volumen(double l) { return l * l * l; }
    static double volumen(double r, double h) { return Math.PI * r * r * h; }
    static double volumen(double l, double a, double h) { return l * a * h; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--- VOLUMENES ---\n1. Cubo\n2. Cilindro\n3. Prisma\n4. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Lado: ");
                    System.out.println("Volumen: " + volumen(sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Radio: ");
                    double r = sc.nextDouble();
                    System.out.print("Altura: ");
                    System.out.println("Volumen: " + volumen(r, sc.nextDouble()));
                    break;
                case 3:
                    System.out.print("Largo: ");
                    double l = sc.nextDouble();
                    System.out.print("Ancho: ");
                    double a = sc.nextDouble();
                    System.out.print("Altura: ");
                    System.out.println("Volumen: " + volumen(l, a, sc.nextDouble()));
                    break;
                case 4: System.out.println("Programa finalizado."); break;
                default: System.out.println("Opcion incorrecta.");
            }
        } while (op != 4);
        sc.close();
    }
}