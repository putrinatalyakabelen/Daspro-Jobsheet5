import java.util.Scanner;

/**
 * Latihan111
 */
public class Latihan111 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.println("Masukkan suhu : ");
        int suhu = sc11.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        }if(suhu < 20){
            System.out.println("Silahkan pakai baju tebal");
        }else {
            System.out.println("Silahkan pakai topi");
        }
    }
}