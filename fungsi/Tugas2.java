import java.util.Scanner;

public class Tugas2 {

    /*
     * Fungsi rekursif
     */
    static int penjumlahanRekursif(int f) {

        if (f == 1) {
            System.out.print("1");
            return 1;

        } else {
            int hasil = f + penjumlahanRekursif(f - 1);
            System.out.print(" + " + f);
            return hasil;
        }

    }

    /*
     * fungsi main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        // Memanggil fungsi rekursif
        int hasilPenjumlahan = penjumlahanRekursif(f);
        System.out.println(" = " + hasilPenjumlahan);

        sc.close();
    }
}
