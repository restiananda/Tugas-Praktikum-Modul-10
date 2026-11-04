/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kostbaru;

import java.util.Scanner;

public class KostBaru {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PengelolaKost pengelola = new PengelolaKost();

        DataKamar kamar1 = new KamarPutraBaru(
                101, "Andi", 500000, true);

        DataKamar kamar2 = new KamarPutribaru(
                202, "Jena", 600000, true);

        DataKamar kamar3 = new KamarPutraBaru(
                103, "Satria", 550000, false);

        DataKamar kamar4 = new KamarVIPBaru(
                301, "Layla", 1000000, true);

        pengelola.tambahKamar(kamar1);
        pengelola.tambahKamar(kamar2);
        pengelola.tambahKamar(kamar3);
        pengelola.tambahKamar(kamar4);

        Penghuni penghuni1 = new Penghuni("P001", "Andi");
        Penghuni penghuni2 = new Penghuni("P002", "Jena");
        Penghuni penghuni3 = new Penghuni("P003", "Satria");

        pengelola.tambahPenghuni(penghuni1);
        pengelola.tambahPenghuni(penghuni2);
        pengelola.tambahPenghuni(penghuni3);

        TransaksiKost transaksi = new TransaksiKost();

        int pilihan = 0;

        while (pilihan != 5) {

            System.out.println();
            System.out.println("===============================");
            System.out.println("   SISTEM PENGELOLAAN KOST");
            System.out.println("===============================");
            System.out.println("1. Tampilkan Fasilitas Kost");
            System.out.println("2. Tampilkan Semua Kamar");
            System.out.println("3. Tampilkan Semua Penghuni");
            System.out.println("4. Proses Transaksi Kost");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = input.nextInt();

                switch (pilihan) {

                    case 1:
                        pengelola.tampilkanFasilitas();
                        break;

                    case 2:
                        pengelola.tampilkanSemuaKamar();
                        break;

                    case 3:
                        pengelola.tampilkanSemuaPenghuni();
                        break;

                    case 4:
                        input.nextLine();

                        System.out.print("Masukkan ID penghuni: ");
                        String id = input.nextLine();

                        System.out.print("Masukkan nomor kamar: ");
                        int nomorKamar = input.nextInt();

                        Penghuni penghuni = pengelola.cariPenghuni(id);
                        DataKamar kamar = pengelola.cariKamar(nomorKamar);

                        transaksi.prosesTransaksi(penghuni, kamar);
                        break;

                    case 5:
                        System.out.println("Program selesai. Terima kasih.");
                        break;

                    default:
                        System.out.println("Pilihan menu tidak tersedia.");
                }

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input.");
                input.nextLine();
            }
        }

        input.close();
    }
}