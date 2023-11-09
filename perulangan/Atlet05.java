public class Atlet05 {
    public static void main(String[] args) {

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };
        String[][] atlet = {
            {"Ying", "Yaya", "Gopal", "Upin", "Ipin"},
            {"Adit", "Asep", "Brando", "Windah", "Basundara"},
            {"Ilham", "Kaka", "Bili", "Adit", "Sopo"},
            {"Jarwo", "Boboboy", "Adudu", "Adada", "Probe"}
        };

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Atlet Cabang Olahraga: " + cabor[i] + "\n");

            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {

                    if (atlet[i][j].compareTo(atlet[i][k]) > 0) {
                        String temp = atlet[i][j];
                        atlet[i][j] = atlet[i][k];
                        atlet[i][k] = temp;
                    }
                }
                System.out.println("Atlet " + (j + 1) + ": " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}
