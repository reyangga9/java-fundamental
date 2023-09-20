//package chapter1.Project_3;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Kalkulator {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char operator;
//        double hasil = 0.0;
//        List<String> history = new ArrayList<>();
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("history.txt", true))) {
//            // Membaca riwayat operasi dari file history.txt
//            history = bacaRiwayatDariFile("history.txt");
//
//            do {
//                System.out.println("Pilih operasi:");
//                System.out.println("1. Penambahan (+)");
//                System.out.println("2. Pengurangan (-)");
//                System.out.println("3. Perkalian (*)");
//                System.out.println("4. Pembagian (/)");
//                System.out.println("5. Cetak Riwayat ke File");
//                System.out.println("6. Tampilkan Riwayat di Terminal");
//                System.out.println("7. Lihat Total Hasil Operasi");
//                System.out.println("8. Keluar");
//                System.out.print("Masukkan nomor operasi (1/2/3/4/5/6/7/8): ");
//                int pilihan = input.nextInt();
//
//                if (pilihan == 8) {
//                    break; // Keluar dari program
//                }
//
//                if (pilihan < 1 || pilihan > 8) {
//                    System.out.println("Operasi tidak valid. Silakan coba lagi.");
//                    continue;
//                }
//
//                if (pilihan == 5) {
//                    // Menyimpan riwayat ke file history.txt
//                    cetakRiwayatKeFile(history, writer);
//                    continue;
//                } else if (pilihan == 6) {
//                    // Menampilkan riwayat di terminal
//                    tampilkanRiwayat(history);
//                    continue;
//                } else if (pilihan == 7) {
//                    // Melihat total hasil operasi
//                    double total = hitungTotal(history);
//                    System.out.println("Total hasil semua operasi: " + total);
//                    continue;
//                }
//
//                System.out.print("Masukkan angka pertama: ");
//                double angka1 = input.nextDouble();
//                System.out.print("Masukkan angka kedua: ");
//                double angka2 = input.nextDouble();
//
//                switch (pilihan) {
//                    case 1:
//                        operator = '+';
//                        hasil = tambah(angka1, angka2);
//                        break;
//                    case 2:
//                        operator = '-';
//                        hasil = kurang(angka1, angka2);
//                        break;
//                    case 3:
//                        operator = '*';
//                        hasil = kali(angka1, angka2);
//                        break;
//                    case 4:
//                        operator = '/';
//                        hasil = bagi(angka1, angka2);
//                        break;
//                    default:
//                        operator = ' ';
//                        System.out.println("Operasi tidak valid.");
//                }
//
//                String operasi = angka1 + " " + operator + " " + angka2 + " = " + hasil;
//                history.add(operasi);
//
//                System.out.println("Hasil: " + hasil);
//
//            } while (true); // Perulangan tak terbatas
//
//        } catch (IOException e) {
//            System.out.println("Gagal menulis ke file history.txt.");
//        }
//    }
//
//    public static double tambah(double angka1, double angka2) {
//        return angka1 + angka2;
//    }
//
//    public static double kurang(double angka1, double angka2) {
//        return angka1 - angka2;
//    }
//
//    public static double kali(double angka1, double angka2) {
//        return angka1 * angka2;
//    }
//
//    public static double bagi(double angka1, double angka2) {
//        if (angka2 != 0) {
//            return angka1 / angka2;
//        } else {
//            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
//            return Double.NaN; // Mengembalikan NaN (Not-a-Number)
//        }
//    }
//
//    public static void cetakRiwayatKeFile(List<String> history, BufferedWriter writer) {
//        try {
//            System.out.println("Menyimpan riwayat ke file history.txt...");
//            for (String operasi : history) {
//                (operasi + "\n");
//            }
//            System.out.println("Riwayat telah dicetak ke dalam file history.txt.");
//        } catch (IOException e) {
//            System.out.println("Gagal mencetak riwayat ke file history.txt.");
//        }
//    }
//
//    public static void tampilkanRiwayat(List<String> history) {
//        System.out.println("Riwayat operasi:");
//        for (String operasi : history) {
//            System.out.println(operasi);
//        }
//    }
//
//    public static List<String> bacaRiwayatDariFile(String fileName) {
//        List<String> history = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                history.add(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Gagal membaca file " + fileName);
//        }
//        return history;
//    }
//
//    public static double hitungTotal(List<String> history) {
//        double total = 0.0;
//        for (String operasi : history) {
//            // Mengekstrak hasil dari operasi (angka setelah "=")
//            String[] parts = operasi.split("=");
//            if (parts.length == 2) {
//                try {
//                    double hasilOperasi = Double.parseDouble(parts[1].trim());
//                    total += hasilOperasi;
//                } catch (NumberFormatException e) {
//                    // Jika gagal mengkonversi hasil operasi, abaikan operasi tersebut
//                    continue;
//                }
//            }
//        }
//        return total;
//    }
//}
//
