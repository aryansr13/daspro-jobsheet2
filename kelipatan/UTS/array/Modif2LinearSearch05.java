import java.util.Scanner;
public class Modif2LinearSearch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key = 20;
        int hasil = 0, x, status = 1;

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
            if (arrayInt [i] == key && key == 0) {
                System.out.println("Masukan key yang dicari : 0");
                status = -1;
                System.exit(status);
            } else if (arrayInt [i] == key && key != 0) {
                hasil += i;
                break;
            } 
        }
        if (hasil == 0) {
            System.out.println("Key tidak ditemukan");
        } else if (hasil != 0){
        System.out.println("Key ada dalam array ada di posisi indeks ke-" + hasil);
        }
    }
}
