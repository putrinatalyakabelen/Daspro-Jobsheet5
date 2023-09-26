import java.util.Scanner;

/**
 * TugasIndividu1_11
 */
public class TugasIndividu1_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jarak;

        System.out.println("Masukkan jarak anda: ");
        jarak = sc.nextInt();
        if(jarak <= 5){
        System.out.println("Gunakan melee weapon");
        } else if (jarak > 5){
        System.out.println("Gunakan ranged weapon");
        }
    }
}