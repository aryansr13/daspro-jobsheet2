import java.util.Scanner;

public class Tugas3 {

    /*
     * Fungsi rekursif
     */
    static boolean cekPrimaRekursif(int n, int i) {

        if (i == 1) {
            return true; // Jika i mencapai 1 bilangan adalah prima

        } else {
            if (n % i == 0) {
                return false; // Jika n habis dibagi i bukan bilangan prima

            } else {
                return cekPrimaRekursif(n, i - 1); // Periksa faktor
            }
        }
    }

    /*
     * Fungsi main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Memanggil fungsi rekursif
        if (cekPrimaRekursif(n, n / 2)) {
            System.out.println(n + " adalah bilangan prima.");

        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

        // Faktor pembagi n
        System.out.print("Faktor pembagi: ");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
