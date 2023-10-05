import java.util.Scanner;

//Sistem Login

public class LatihanIndividu205 {
    public static void main(String[] args) {
        String username = "ARYANSAPUTRAR";
        String password = "Akuganteng123";
        String inUser, inPassword;

        Scanner inpot = new Scanner(System.in);

        System.out.println("LOGIN USER");
        System.out.print("Masukkan Username anda   : ");
        inUser = inpot.next();
        System.out.print("Masukkan Password Anda   : ");
        inPassword = inpot.next();

        if (username.equals(inUser) && password.equals(inPassword)) {
            System.out.println("Masuk ke Sistem ");
        } else {
            System.out.println("User atau Password yang anda masukkan Salah!");
        }
    }

}