import java.util.Scanner;

public class tugas108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double diskon = 0;
        double totalPendapatan = 0;
        double totalBayar;
        int tiket = 0; 
        int totalHarga, jumlahPelanggan;

        System.out.print("Masukkan jumlah pelanggan yang ingin dihitung: ");
        jumlahPelanggan = input.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.print("Masukan jumlah tiket dari pelanggan ke-" + i + ": ");
            tiket = input.nextInt();

            if (tiket <= 0) {
                System.out.println("input tidak valid, ulangi!");
                i--;
                System.out.println();
                continue;
            }

            totalHarga = 50000 * tiket;

            if (tiket >= 10) {
                diskon = 0.15 * totalHarga;
            }else if (tiket >= 4) {
                diskon = 0.15 * totalHarga;
            }else {
                diskon = 0;
            }

            totalBayar = totalHarga - diskon;
            totalPendapatan += totalBayar;

        }

        System.out.println("Total pendapatan: " + totalPendapatan);
        input.close();
    }
}
