public class T1_B4Corregido{

    static int total = 0;

    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            sumar(i);
        }

        System.out.println(total);

        int total = 5;
        System.out.println(total);
    }
}