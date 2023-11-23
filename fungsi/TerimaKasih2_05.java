import java.util.Scanner;

public class TerimaKasih2_05 {
    public static void UcapanTerimaKasih() {
        System.out.println("Terima kasih banyak!");
        System.out.println("Semoga Anda selalu dalam keadaan baik.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}
