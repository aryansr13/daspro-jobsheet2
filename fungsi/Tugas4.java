import java.util.Scanner;

public class Tugas4 {

    /*
     * Fungsi rekursif
     */
    static int hitungPasanganMarmut(int bulan) {

        if (bulan <= 2) {
            return 1; // pasangan marmut baru lahir setelah 2 bulan

        } else {
            // Jumlah pasangan marmut pada bulan ke-n
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    /*
     * Fungsi main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input bulan
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();

        // Memanggil fungsi rekursif
        int jumlahPasangan = hitungPasanganMarmut(bulan);

        // Jumlah pasangan marmut produktif dan belum produktif
        int jumlahProduktif = hitungPasanganMarmut(bulan - 2); // Bulan sebelumnya sudah produktif
        int jumlahBelumProduktif = jumlahPasangan - jumlahProduktif;

        System.out.println(
                "\nJumlah pasangan marmut yang produktif pada bulan ke-" + bulan + " adalah: " + jumlahProduktif);
        System.out.println("Jumlah pasangan marmut yang belum produktif pada bulan ke-" + bulan + " adalah: "
                + jumlahBelumProduktif);

        // total pasangan marmut
        System.out.println("\nJumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);

        sc.close();
    }
}
