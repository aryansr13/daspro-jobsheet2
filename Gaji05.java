import java.util.Scanner;

public class Gaji05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotalGaji, JmlGaji, potGaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = sc.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda: ");
        JmlTdkMasuk = sc.nextInt();
        System.out.println("Masukkan Jumlah Gaji Anda: ");
        JmlGaji = sc.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Anda: ");
        potGaji = sc.nextInt();
        TotalGaji = (jmlMasuk * JmlGaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotalGaji);
    }
}