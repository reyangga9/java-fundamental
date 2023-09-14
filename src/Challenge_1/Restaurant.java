package Challenge_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Restaurant {
    public static void main(String[] args) {
        int many;
        int choice;
        int hasil = 0;
        Scanner input = new Scanner(System.in);
        List<String> restaurant = new ArrayList<>();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("restaurant.txt", true))) {
            // Membaca riwayat operasi dari file history.txt


            System.out.println("================");
            System.out.println("Selamat Datang di Nasi Goreng 99");
            System.out.println("================");
            System.out.println("Silahkan Pilih Makanan : ");
            System.out.println("1.  Nasi Goreng          | 15.000");
            System.out.println("2.  Mie Goreng           | 13.000");
            System.out.println("3.  Bihun Goreng         | 12.000");
            System.out.println("4.  Es Teh Manis         | 3.000");
            System.out.println("5.  Es Jeruk             | 8.000");
            System.out.println("98. Liat Menu");
            System.out.println("99. Pesan dan Bayar");


            for(int i =0;i<99999;i++){

                System.out.print("=======Pilih Menu=======  : ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Anda memesan nasi goreng ");
                        System.out.print("Berapa banyak anda ingin memesan : ");
                        many = input.nextInt();
                        if(many == 0){
                            break;
                        } else{
                            hasil += (15000 * many);
                            restaurant.add("Nasi Goreng " + many);
                            System.out.println("Total harga yang harus dibayar adalah " + hasil);

                        }

                        break;
                    case 2:
                        System.out.println("Anda memesan mie goreng ");
                        System.out.print("Berapa banyak anda ingin memesan : ");
                        many = input.nextInt();
                        if(many == 0){
                            break;
                        } else{
                            hasil += (13000 * many);
                            System.out.println("Total harga yang harus dibayar adalah " + hasil);


                        }

                        break;
                    case 3:
                        System.out.println("Anda memesan bihun goreng ");
                        System.out.print("Berapa banyak anda ingin memesan : ");
                        many = input.nextInt();
                        if(many == 0){
                            break;
                        } else{
                            hasil += (12000 * many);
                            System.out.println("Total harga yang harus dibayar adalah " + hasil);

                        }
                        break;
                    case 4:
                        System.out.println("Anda memesan es teh manis ");
                        System.out.print("Berapa banyak anda ingin memesan : ");
                        many = input.nextInt();
                        if(many == 0){
                            break;
                        } else{
                            hasil += (3000 * many);
                            System.out.println("Total harga yang harus dibayar adalah " + hasil);
                        }

                        break;
                    case 5:
                        System.out.println("Anda memesan es jeruk ");
                        System.out.print("Berapa banyak anda ingin memesan : ");
                        many = input.nextInt();
                        if(many == 0){
                            break;
                        } else{
                            hasil += (8000 * many);
                            System.out.println("Total harga yang harus dibayar adalah " + hasil);
                        }


                        break;
                    case 98:
                        System.out.println("================");
                        System.out.println("Selamat Datang di Nasi Goreng 99");
                        System.out.println("================");
                        System.out.println("Silahkan Pilih Makanan : ");
                        System.out.println("1.  Nasi Goreng          | 15.000");
                        System.out.println("2.  Mie Goreng           | 13.000");
                        System.out.println("3.  Bihun Goreng         | 12.000");
                        System.out.println("4.  Es Teh Manis         | 3.000");
                        System.out.println("5.  Es Jeruk             | 8.000");
                        System.out.println("98. Liat Menu");
                        System.out.println("99. Pesan dan Bayar");
                        break;
                    case 99:
                        System.out.println("Total biaya pesanan anda adalah : " + hasil);

                        System.out.println("Terima kasih sudah memesan! ");


                        System.exit(1);

                    default:
                        System.out.println("Anda memesan bihun goreng ");
                        break;

                }
            }



        }catch (IOException e) {
            System.out.println("Gagal menulis ke file restaurant.txt.");
        }





    }
}
