import java.util.Scanner;

class Penjualan {
    String namaBarang;
    int hargaBarang;
    int jumlahBarang;

    int hitungTotalHArga() {
        return hargaBarang * jumlahBarang;
    }

    void tampilkanTotalHarga() {
        System.out.println("Total harga yang dibayar: " + hitungTotalHArga());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();

        System.out.println("Masukkan nama barang: ");
        penjualan.namaBarang = sc.nextLine();
        System.out.println("Masukkan harga barang: ");
        penjualan.hargaBarang = sc.nextInt();
        System.out.println("Masukkan jumlah barang: ");
        penjualan.jumlahBarang = sc.nextInt();
        penjualan.tampilkanTotalHarga();
    }
}