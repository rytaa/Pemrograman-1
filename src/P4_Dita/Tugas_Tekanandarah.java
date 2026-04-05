package P4_Dita;
import java.util.Scanner;

public class LatihanTekananDarah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Tekanan Darah ===");

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tekanan Sistolik (atas): ");
        double sistolik = input.nextDouble();

        System.out.print("Masukkan Tekanan Diastolik (bawah): ");
        double diastolik = input.nextDouble();

        double map = (sistolik + (2 * diastolik)) / 3;

        System.out.println("\n===== HASIL =====");
        System.out.println("Nama                : " + nama);
        System.out.println("Tekanan Sistolik    : " + sistolik);
        System.out.println("Tekanan Diastolik   : " + diastolik);
        System.out.printf("Rata-rata Tekanan (MAP): %.2f\n", map);
        System.out.println("===================");

        input.close();
    }
}
