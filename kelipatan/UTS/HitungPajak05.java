import java.util.Scanner;

public class HitungPajak05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== UTS PRAKTIKUM DASAR PEMOGRAMAN TI-1F ==");
        System.out.println("Dibuat oleh : Aryan Saputra Rahmad");
        System.out.println("NIM : 2341720022");
        System.out.println("===========================================");
        
        System.out.println("Apakah Anda memiliki usaha? (ya/tidak)");
        String memilikiUsaha = scanner.nextLine();
        
        double penghasilan = 0;
        if (memilikiUsaha.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan penghasilan dalam 1 tahun:");
            penghasilan = scanner.nextDouble();
            scanner.nextLine();
        }
        
        double pajakPenghasilan = 0.15 * penghasilan;
        
        System.out.println("Masukkan jumlah jenis harta kekayaan yang Anda miliki:");
        int jumlahHarta = scanner.nextInt();
        scanner.nextLine();
        
        double totalHarta = 0;
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.println("Masukkan nama harta " + (i + 1) + ":");
            String namaHarta = scanner.nextLine();
            
            System.out.println("Masukkan nilai jual " + namaHarta + ":");
            double nilaiJual = scanner.nextDouble();
            scanner.nextLine();
            
            totalHarta += nilaiJual;
        }
        
        System.out.println("Apakah Anda sudah berkeluarga? (ya/tidak)");
        String berkeluarga = scanner.nextLine();
        
        double potonganPajak = 0;
        if (berkeluarga.equalsIgnoreCase("ya")) {
            System.out.println("Berapa anak Anda yang berstatus kuliah?");
            int anakKuliah = scanner.nextInt();
            
            System.out.println("Berapa anak Anda yang berstatus SMA?");
            int anakSMA = scanner.nextInt();
            
            if (anakKuliah == 1 && anakSMA == 1 && totalHarta >= 50000000) {
                potonganPajak = 0.10;
            } else if (anakKuliah == 0 && anakSMA == 0 && totalHarta < 50000000) {
                potonganPajak = 0.05;
            }
        }
        
        double totalPajak = (pajakPenghasilan + totalHarta) * (1 - potonganPajak);
        
        System.out.println("Total pajak yang harus Anda bayar: Rp." + totalPajak);
    }
}