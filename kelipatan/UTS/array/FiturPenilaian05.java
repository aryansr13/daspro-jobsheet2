import java.util.Scanner;

public class FiturPenilaian05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int feedbackLimit = 1;
        String[] arrayFeedback = new String[feedbackLimit];
        int inputFeedback = 0;

        // input penilaian dan feedback
        String feedback = "";
        String penilaian = "";
        boolean validInput = false;

        System.out.println("\n==================================================");
        System.out.println("=            Penilaian dan feedback              =");
        System.out.println("==================================================\n");

        // input penilaian user
        while (!validInput) {

            System.out.println("Silahkan Beri Nilai Kepuasan Anda Terhadap Aplikasi Ini (1-5)");
            System.out.println("1 = Sangat Tidak Puas");
            System.out.println("2 = Tidak Puas");
            System.out.println("3 = Biasa Saja");
            System.out.println("4 = Puas");
            System.out.println("5 = Sangat Puas");
            System.out.print("Masukan Penilaian Anda: ");
            penilaian = sc.nextLine();

            // penilaian harus bernilai 1-5
            if (penilaian.equals("1") || penilaian.equals("2") || penilaian.equals("3") || penilaian.equals("4")
                    || penilaian.equals("5")) {
                validInput = true;
                // penilaian selain 1-5
            } else {
                System.out.println("Input yang Anda Masukan Salah! Harap masukkan angka antara 1-5.\n");
            }
        }

        // input feedback kepuasan pengguna
        System.out.print("Silahkan berikan feedback Anda: ");
        feedback = sc.nextLine();

        if (inputFeedback < feedbackLimit) {

            System.out.println("\nFeedback Anda Telah Tersimpan");
            System.out.println("Terimakasih telah memberikan penilaian dan feedback pada aplikasi kami");
            // feedback disimpan di array
            arrayFeedback[inputFeedback] = feedback;
            inputFeedback++;

            // feedback telah lebih dimasukan satu kali
        } else {
            System.out.println("\nMaaf anda hanya dapat memasukan feedback 1 kali saja!");
            System.out.println("Terimakasih telah memberikan penilaian pada aplikasi kami");
        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }
}
