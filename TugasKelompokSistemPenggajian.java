import java.util.Scanner;

public class TugasKelompokSistemPenggajian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^+");
        System.out.println("|    * PILIHAN MENU *     |");
        System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^+");
        System.out.println("| [1] Login               |");
        System.out.println("| [2] Input Data Karyawan |");
        System.out.println("| [3] Exit                |");
        System.out.println("+-------------------------+");
        System.out.print("Masukan Menu Pilihan Anda: ");
        int menu;
        menu = sc.nextInt();
        switch (menu) {
            case 1:

                // boolean sukses = true;
                System.out.println("===========================");
                System.out.println("           LOGIN           ");
                System.out.println("===========================");

                System.out.println("Masukan Username : ");
                String username = sc1.nextLine();

                System.out.println("Masukan Password : ");
                String password = sc2.nextLine();
                String validUser = "admin";
                String validPas = "123";
                  if (username.equals(validUser) && password.equals(validPas)) {

                    System.out.println("Berhasil Login");
                } else {
                    System.out.println("Username atau Password anda salah");
                    System.out.println(username + password);
                }

                break;

            case 2:

                System.out.println("Masukan Nama Karyawan");
                String nama = sc1.nextLine();
                System.out.println("Masukan umur ");
                String umur = sc2.nextLine();
                System.out.println("Gaji ");
                int gaji = sc.nextInt();
                System.out.println("Masukan Golongan");
                int golongan = sc.nextInt();
                if (golongan == 1) {
                    gaji += 500000;
                } else if (golongan == 2) {
                    gaji += 200000;
                } else if (golongan == 3) {
                    gaji += 100000;
                }else {
                    System.out.println("Tidak dapat bonus");
                }
                System.out.println("Gaji: " + gaji + golongan);

            case 3:
                break;
                     default:

                break;
            }
}
}

