import java.util.Scanner;

public class Percobaan6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan Panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        vol = hitungVolume(t, p, l);

        System.out.println("Luas Persegi panjang adalah " + L);
        System.out.println("Volume balok adalah " + vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
}
