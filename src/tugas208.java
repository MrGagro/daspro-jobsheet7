import java.util.Scanner;

public class tugas208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;
        int i = 1;

        do {
            System.out.print("Masukkan jenis kendaraan ke-" + i + " (1 (motor) / 2 (mobil): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi pakir: ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 3000;
                }
            }
            i++;
        }while (jenis != 0);
            System.out.println("Total pembayaran: " + total);
            input.close();
    }
}
