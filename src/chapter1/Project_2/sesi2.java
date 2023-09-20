package chapter1.Project_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class sesi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        List<String> history = new ArrayList<>();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
//        System.out.println("5. Cetak Riwayat ke File");
//        System.out.println("6. Tampilkan Riwayat di Terminal");
//        System.out.println("7. Lihat Total Hasil Operasi");
        System.out.println("8. Keluar");
        System.out.print("Masukkan nomor operasi (1/2/3/4/5/6/7/8): ");

        int pilihan = input.nextInt();


        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

//        System.out.print("Pilih operator (+, -, *, /): ");
//        operator = input.next().charAt(0);



        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        double hasil = hitung(angka1, angka2, pilihan);
        System.out.println("Hasil: " + hasil);
    }
    public static double hitung(double angka1, double angka2, int operator) {
        double hasil = 0.0;

        switch (operator) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    System.exit(1);
                }
                break;

            case 5:


            case 8:
                System.out.println("Keluar dari Program");
                System.exit(1);


           default:
                System.out.println("Operasi tidak valid!");
                System.exit(1);
        }

        return hasil;
    }


}

