import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double[] nilai = new double[jumlahSiswa];
        double total = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / jumlahSiswa;
        System.out.println("\nRata-rata nilai seluruh siswa: " + rataRata);
    }
}