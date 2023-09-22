import java.util.Scanner;

class Hadiah {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Belanjaan: Rp ");
        belanja = sc.nexInt();

        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        System.out.println("Terima Kasih...");
    }
}