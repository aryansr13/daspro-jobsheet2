import java.util.Scanner;

public class TugasArray05 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukan banyaknya elemen: ");
        int i = sc15.nextInt();

        int[] array = new int[i];

        double rata2 = 0;
        int total = 0;

        for (int j = 0; j < i; j++) {
            System.out.print("Masukan element ke-" + (j + 1) + " : ");
            array[j] = sc15.nextInt();
            total += array[j];
        }

        rata2 = (double) total / i;

        int nilaiTerendah = array[0];
        int nilaiTertinggi = array[0];

        for (int j = 1; j < i; j++) {
            if (array[j] < nilaiTerendah) {
                nilaiTerendah = array[j];
            }
            if (array[j] > nilaiTertinggi) {
                nilaiTertinggi = array[j];
            }
        }

        System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi);
        System.out.println("Niilai terendah adalah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata adalah: " + rata2);

    }
}
