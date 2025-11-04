import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, jarak, panjang, lebar, tinggi;
        double biayaPerKg, total, volume;

        System.out.println("Masukan berat paket (kg): ");
        berat = input.nextDouble();
      System.out.println("Masukan jarak tempuh (km): ");
      jarak = input.nextDouble();
      System.out.println("Masukan panjang (cm): ");
      panjang = input.nextDouble();
      System.out.println("Masukan lebar (cm): ");
      lebar = input.nextDouble();
      System.out.println("Masukan tinggi (cm): ");
      tinggi = input.nextDouble();

      volume = panjang * lebar * tinggi;

      if (jarak <= 10) {
        biayaPerKg = 4250;
      } else {
        biayaPerKg = 6000;
      }

      total = berat * biayaPerKg;

      if (volume > 100) {
total += 50000;
      }

      System.out.println("Total biaya pengiriman: Rp " + total);
            }
}
