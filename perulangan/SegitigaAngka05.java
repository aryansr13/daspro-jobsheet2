import java.util.Scanner;

public class SegitigaAngka05 {

    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        Boolean isNilai = false;

        while (!isNilai) {

            System.out.print("\nMasukkan nilai N (minimal 3): ");
            int N = sc15.nextInt();

            if (N < 3) {
                System.out.println("Nilai N kurang dari 3, Silahkan masukan nilai N kembali!");

            } else {
                System.out.println();
                for (int i = 1; i <= N; i++) {

                    for (int j = 1; j <= N - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {

                        System.out.print(k + " ");
                    }

                    System.out.println();
                }

                isNilai = true;
            }
        }
    }
}
