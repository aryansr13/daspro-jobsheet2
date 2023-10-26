import java.util.Scanner;
public class Modif2ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, lulus = 0, tdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        x = sc.nextInt();
        int [] nilaiMhs = new int[x];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        
        rataLulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);

        rataTdkLulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai = " + rataTdkLulus);

    }
}
