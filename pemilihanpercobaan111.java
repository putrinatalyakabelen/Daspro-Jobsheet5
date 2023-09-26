import java.util.Scanner;

/**
 * pemilihanpercobaan111
 */
public class pemilihanpercobaan111 {

    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input11.nextInt();

        if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
    
    }
}