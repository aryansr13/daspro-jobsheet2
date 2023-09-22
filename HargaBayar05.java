import java.util.Scanner;

public class HargaBayar05 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merkbuku;
        System.out.println("Masukkan merk buku yang dibeli: ");
        merkbuku = sc.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli: ");
        halBuku = sc.nextInt();
        System.out.println("Masukkan Harga buku yang dibeli: ");
        harga = sc.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan jumlah diskon yang ada dapatkan: ");
        dis = sc.nextDouble();
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;
        System.out.println("Merk buku yang anda beli adalah: " + merkbuku);
        System.out.println("Jumlah halaman buku yang anda beli adalah: " + halBuku);
        System.out.println("Harga Total Yang Harus Dibayar Adalah " + total);
        System.out.println("Harga Diskon Yang Anda Dapatkan Adalah " + jmlDis);
        System.out.println("Harga Setelah Di Diskon Adalah " + bayar);
    }
}