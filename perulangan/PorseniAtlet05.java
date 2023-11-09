import java.util.Arrays;

public class PorseniAtlet05 {

    public static void main(String[] args) {
        // Data atlet-atlet dari tiap cabang olahraga
        String[] atletBadminton = {"Adi", "Budi", "Citra", "Dian", "Eko"};
        String[] atletTenisMeja = {"Fani", "Gilang", "Hani", "Indra", "Joko"};
        String[] atletBasket = {"Krisna", "Lina", "Mira", "Nadia", "Oscar"};
        String[] atletBolaVoly = {"Prita", "Qori", "Rini", "Siti", "Tono"};

        // Mengurutkan nama atlet secara ascending
        Arrays.sort(atletBadminton);
        Arrays.sort(atletTenisMeja);
        Arrays.sort(atletBasket);
        Arrays.sort(atletBolaVoly);

        // Menampilkan nama atlet yang sudah diurutkan
        System.out.println("Atlet Badminton:");
        for (String atlet : atletBadminton) {
            System.out.println(atlet);
        }

        System.out.println("\nAtlet Tenis Meja:");
        for (String atlet : atletTenisMeja) {
            System.out.println(atlet);
        }

        System.out.println("\nAtlet Basket:");
        for (String atlet : atletBasket) {
            System.out.println(atlet);
        }

        System.out.println("\nAtlet Bola Voly:");
        for (String atlet : atletBolaVoly) {
            System.out.println(atlet);
        }
    }
}
