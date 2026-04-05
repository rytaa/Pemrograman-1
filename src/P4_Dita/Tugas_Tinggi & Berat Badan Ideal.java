package P4_Dita;
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Tinggi & Berat Badan Ideal ===");

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tinggi Badan : ");
        double tinggi = input.nextDouble();

        double beratIdeal = (tinggi - 100) - ((tinggi - 100) * 0.1);

        double tinggiMin = tinggi - 5;
        double tinggiMax = tinggi + 5;

        System.out.println("\n===== HASIL =====");
        System.out.println("Nama                  : " + nama);
        System.out.println("Tinggi Badan          : " + tinggi + " cm");
        System.out.printf("Berat Badan Ideal     : %.2f kg\n", beratIdeal);
        System.out.println("Perkiraan Tinggi Ideal: " + tinggiMin + " cm - " + tinggiMax + " cm");
        System.out.println("===================");

        input.close();
    }
}
