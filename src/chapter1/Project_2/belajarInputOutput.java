package chapter1.Project_2;
import java.util.Scanner;

public class belajarInputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka ke 1:");
        int angka1 = input.nextInt();
        System.out.println("Masukkan Angka ke 2:");
        int angka2 = input.nextInt();
        int hasilTambahan = angka1 + angka2;
        System.out.println("Hasil Pertambahan Angka ke-1 dan Angka ke-2 adalah : " + hasilTambahan);
System.exit(1);
    }

}
