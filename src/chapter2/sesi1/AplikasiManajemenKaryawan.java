package chapter2.sesi1;

import java.util.ArrayList;
import java.util.Scanner;

class Karyawan {
    private String nama;
    private String jabatan;

    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }
}

class KaryawanTetap extends Karyawan {
    private double gaji;

    public KaryawanTetap(String nama, String jabatan, double gaji) {
        super(nama, jabatan);
        this.gaji = gaji;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gaji Bulanan: Rp." + gaji);
    }
}

class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;

    public KaryawanKontrak(String nama, String jabatan, int durasiKontrak) {
        super(nama, jabatan);
        this.durasiKontrak = durasiKontrak;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
    }
}

public class AplikasiManajemenKaryawan {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Karyawan Tetap");
            System.out.println("2. Tambah Karyawan Kontrak");
            System.out.println("3. Tampilkan Data Karyawan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Karyawan Tetap: ");
                    String namaTetap = scanner.nextLine();
                    System.out.print("Masukkan Jabatan: ");
                    String jabatanTetap = scanner.nextLine();
                    System.out.print("Masukkan Gaji Bulanan: Rp.");
                    double gajiTetap = scanner.nextDouble();
                    daftarKaryawan.add(new KaryawanTetap(namaTetap, jabatanTetap, gajiTetap));
                    break;
                case 2:
                    System.out.print("Masukkan Nama Karyawan Kontrak: ");
                    String namaKontrak = scanner.nextLine();
                    System.out.print("Masukkan Jabatan: ");
                    String jabatanKontrak = scanner.nextLine();
                    System.out.print("Masukkan Durasi Kontrak (bulan): ");
                    int durasiKontrak = scanner.nextInt();
                    daftarKaryawan.add(new KaryawanKontrak(namaKontrak, jabatanKontrak, durasiKontrak));
                    break;
                case 3:
                    System.out.println("\nData Karyawan:");
                    for (Karyawan karyawan : daftarKaryawan) {
                        karyawan.tampilkanInfo();
                        System.out.println("------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}



