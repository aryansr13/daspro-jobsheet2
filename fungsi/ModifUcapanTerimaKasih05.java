import java.util.Scanner;

public class ModifUcapanTerimaKasih05 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static String UcapanTambahan() {
        return "Good Luck";
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("\nThank you for being the best teacher in the world.\n" + nama +
                ", You inspired me in love for learning and made me feel like I could ask you anything.");
    }

    public static void Tambahan() {
        String ucapanTambahan = UcapanTambahan();
        System.out.println("\nUcapan tambahan: " + ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();

        // ucapan tambahan
        Tambahan();
    }
}
