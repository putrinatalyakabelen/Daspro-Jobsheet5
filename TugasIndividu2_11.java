import java.util.Scanner;

/**
 * TugasIndividu2_11
 */
public class TugasIndividu2_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 111;
        int password = 255;
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        int user = input.nextInt();
        System.out.println("Password  : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login");
        }else{
            System.out.println(" Harap cek kembali username dan password anda");
        }
    }
}