import java.util.Scanner;

public class LatihanIndividu105 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukan Jarak (dengan satuan meter) :");
        int jarak = input15.nextInt();

        if (jarak <= 5) {
            System.out.print("Memakai melee weapon");
        } else if (jarak <= 1000) {
            System.out.print("Memakai ranged weapon ");
        } else {
            System.out.print("Tidak menyerang");
        }
    }

}