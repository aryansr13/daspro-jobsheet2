import java.util.Scanner;

public class NilaiMahasiswa05 {
    static final int JUMLAH_MAHASISWA = 5;
    static final int JUMLAH_MINGGU = 7;

    static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];

    public static void inputNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai Tugas Mahasiswa:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nilaiTertinggiHari() {
        int[] totalNilaiHari = new int[JUMLAH_MINGGU];
        int maxNilai = 0;
        int hariMax = 0;

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            totalNilaiHari[j] = 0;
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilaiHari[j] += nilaiMahasiswa[i][j];
            }
            if (totalNilaiHari[j] > maxNilai) {
                maxNilai = totalNilaiHari[j];
                hariMax = j + 1;
            }
        }

        System.out.println("\nNilai Tertinggi pada Hari ke-" + hariMax);
    }

    public static void mahasiswaTertinggi() {
        int maxNilai = 0;
        int mahasiswaMax = 0;
        int mingguMax = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                if (nilaiMahasiswa[i][j] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][j];
                    mahasiswaMax = i + 1;
                    mingguMax = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa Tertinggi: Mahasiswa ke-" + mahasiswaMax);
        System.out.println("Nilai Tertinggi pada Minggu ke-" + mingguMax + ": " + maxNilai);
    }

    public static void main(String[] args) {
        inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        nilaiTertinggiHari();
        mahasiswaTertinggi();
    }
}
