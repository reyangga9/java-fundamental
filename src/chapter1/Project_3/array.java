package chapter1.Project_3;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int x[] = new int[5];

        x[0] = 500;
        x[1] = 350;
        x[2] = 45500;
        x[3] = 640;
        x[4] = 5120;
//cara menampilkamn array harus dengan for loop
        for (int i =0;i<x.length;i++){
            System.out.println(x[i]);
        }
//        cara kedua untuk menampilkan array import library Arrays
        String y = Arrays.toString(x);
        System.out.println(y);
    }
}
