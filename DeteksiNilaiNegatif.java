import java.util.Scanner;

public class DeteksiNilaiNegatif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan berapa perulangan : ");
        int a = s.nextInt();
        int[] angka = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < 0) {
                System.out.println("Angka negatif = " + angka[i]);
            }
        }

        s.close();
    }
}
