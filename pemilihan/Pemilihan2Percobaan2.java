import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Masukkan Sudut 1 : ");
        float sudut1 = input05.nextFloat();
        System.out.println("Masukkan Sudut 2 : ");
        float sudut2 = input05.nextFloat();
        System.out.println("Masukkan Sudut 3 : ");
        float sudut3 = input05.nextFloat();
        
        float totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");

    }
}