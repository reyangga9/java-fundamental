package chapter1.Challenge_1;

import java.util.Scanner;


public class Restaurant {


//    public static void main(String[] args) {
//        int many;
//        int choice;
//        int hasil = 0;
//        Scanner input = new Scanner(System.in);
//
//            menu();
//
//            for(int i =0;i<99999;i++){
//
//                System.out.print("=======Pilih Menu=======: ");
//                choice = input.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        Pesanan(hasil,15000,"Nasi Goreng");
//                        break;
//                    case 2:
//                        Pesanan(hasil,13000,"Mie Goreng");
//                        break;
//                    case 3:
//                        Pesanan(hasil,12000,"Bihun Goreng");
//                        break;
//                    case 4:
//                        Pesanan(hasil,3000,"Es Teh Manis");
//                        break;
//                    case 5:
//
//                        Pesanan(hasil,8000,"Es Jeruk");
//                        break;
//                    case 98:
//                       menu();
//                        break;
//                    case 99:
//                        System.out.println("Total biaya pesanan anda adalah : " + hasil);
//
//                        System.out.println("Terima kasih sudah memesan! ");
//
//
//                        System.exit(1);
//
//                    default:
//                        System.out.println("Anda memesan bihun goreng ");
//                        break;
//
//                }
//        }
//
//    }
    static void menu(){
        System.out.println("================");
        System.out.println("Selamat Datang di  Binar FUD");
        System.out.println("================");
        System.out.println("Silahkan Pilih Makanan : ");
        System.out.println("1.  Nasi Goreng          | 15.000");
        System.out.println("2.  Mie Goreng           | 13.000");
        System.out.println("3.  Bihun Goreng         | 12.000");
        System.out.println("4.  Es Teh Manis         | 3.000");
        System.out.println("5.  Es Jeruk             | 8.000");
        System.out.println("98. Liat Menu");
        System.out.println("99. Pesan dan Bayar");
    }

    static int Pesanan(int hasil,int harga, String pesanan){
        Scanner input = new Scanner(System.in);


        System.out.println("Anda memesan " + pesanan);
        int banyak = input.nextInt();
        System.out.print("Berapa banyak anda ingin memesan : ");

        if(banyak == 0){
          return 0;
        } else{
             hasil += (harga * banyak);
            System.out.println("Total harga yang harus dibayar adalah " + hasil);
            return hasil;

        }
    }


}
