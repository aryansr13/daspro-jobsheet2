public class Kubus05 {
    
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {
        double sisiKubus = 5.0; 

        double volume = hitungVolume(sisiKubus);
        System.out.println("Volume Kubus: " + volume);

        
        double luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
