package P4_Dita;
import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Input Nilai Mahasiswa");

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Presensi (total pertemuan): ");
        double presensi = input.nextDouble();

        System.out.print("Masukkan Kehadiran (hadir berapa kali): ");
        double kehadiran = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        double nilaiKehadiran = (kehadiran / presensi) * 100;

        double totalNilai = (nilaiKehadiran * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);

        System.out.println("\n-------------------------------");
        System.out.println("HASIL AKHIR");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jumlah Kehadiran : " + kehadiran + " dari " + presensi);
        System.out.println("Nilai Kehadiran : " + nilaiKehadiran);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("---------------------------------");

        input.close();
    }
}
