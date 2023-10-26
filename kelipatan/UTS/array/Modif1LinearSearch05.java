
import java.util.Scanner;
public class Modif1LinearSearch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key = 20;
        int hasil = 0, x;

        System.out.print("Masukkan jumlah elemen array : ");
        x = sc.nextInt();
        int [] arrayInt = new int [x];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt [i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt [i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array ada di posisi indeks ke-" + hasil);
    }
}
