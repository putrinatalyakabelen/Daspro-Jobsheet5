import java.util.Scanner;

/**
 * PemilihanPercobaan211
 */
public class PemilihanPercobaan211 {

    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float uas = input11.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input11.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = input11.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input11.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}