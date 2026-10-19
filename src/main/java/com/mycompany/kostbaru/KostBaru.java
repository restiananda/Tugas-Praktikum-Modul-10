/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kostbaru;

import java.util.ArrayList;
import java.util.Scanner;

public class KostBaru {
    
    public static void prosesKamar(DataKamar kamar) {
        System.out.println();
        System.out.println("=== PROSES ===");
        kamar.tampilkanInfo();
    }
    
    public static void main(String[] args) {
        
        ArrayList<DataKamar> daftarKamar = new ArrayList<>();
        
        daftarKamar.add(new KamarPutraBaru(101, "Andi", 500000, true));
        daftarKamar.add(new KamarPutribaru(202, "Jena", 600000, true));
        daftarKamar.add(new KamarPutraBaru(103, "satria", 550000, false));
        daftarKamar.add(new KamarVIPBaru(301, "Layla", 1000000, true));
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = 0;
        
        while (pilihan != 4) {
            
            System.out.println();
            System.out.println("===============================");
            System.out.println("   SISTEM PENGELOLAAN KOST ");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Baru");
            System.out.println("2. Tampilkan seluruh Data");
            System.out.println("3. Pencarian ");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            
            pilihan = input.nextInt();
            
            switch (pilihan) {
                
                case 1:
                    System.out.println("=== TAMBAH DATA BARU ===");
                    System.out.println("1. Kamar Putra");
                    System.out.println("2. Kamar Putri");
                    System.out.println("3. Kamar VIP");
                    System.out.print("Pilih tipe kamar: ");
                    
                    int tipe = input.nextInt();
                    
                    System.out.print("Nomor kamar: ");
                    int nomorBaru = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Nama penghuni: ");
                    String penghuniBaru = input.nextLine();
                    
                    System.out.print("Harga kamar: ");
                    double hargaBaru = input.nextDouble();
                    
                    if (tipe == 1) {
                        System.out.print("Apakah ada AC? (true/false): ");
                        boolean ac = input.nextBoolean();
                        
                        daftarKamar.add(new KamarPutraBaru(nomorBaru, penghuniBaru, hargaBaru, ac));
                        System.out.println("Data kamar putra berhasil ditambahkan.");
                        
                    } else if (tipe == 2) {
                        System.out.print("Apakah ada wifi? (true/false): ");
                        boolean wifi = input.nextBoolean();
                        
                        daftarKamar.add(new KamarPutribaru(nomorBaru, penghuniBaru, hargaBaru, wifi));
                        
                        System.out.println("Data kamar putri berhasil ditambahkan.");
                        
                    } else if (tipe == 3){
                        
                        System.out.print("Apakah ada fasilitas premium? (true/false): ");
                        boolean premium = input.nextBoolean();
                        
                        daftarKamar.add(new KamarVIPBaru(nomorBaru, penghuniBaru, hargaBaru, premium));
                        
                        System.out.println("Data kamar VIP berhasil ditambahkan.");
                          
                    } else {
                        System.out.println("Tipe kamar tidak tersedia.");
                    }
                    break;
                    
                case 2:
                    System.out.println();
                    System.out.println("=== DAFTAR SELURUH KAMAR ===");
                    
                    for (DataKamar kamar : daftarKamar) {
                        System.out.println("------------------------");
                        kamar.tampilkanInfo();
                    }
                    
                    System.out.println("------------------------");
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.println("=== PENCARIAN ===");
                    System.out.print("Masukkan nomor kamar: ");
                    
                    int nomorCari = input.nextInt();
                    
                    boolean ditemukan = false;
                    
                    for (DataKamar kamar : daftarKamar){
                        if (kamar.getNomor() == nomorCari) {
                            ditemukan = true;
                            
                            prosesKamar(kamar);
                            if (kamar instanceof BisaDipesan){
                                BisaDipesan pesan = (BisaDipesan) kamar;
                                pesan.pesanKamar();
                            }
                            if (kamar instanceof BisaDibersihkan) {
                                BisaDibersihkan bersih = (BisaDibersihkan) kamar;
                                bersih.bersihkanKamar();
                            }
                            
                            kamar.tampilkanInfo("Data diproses dengan metode overload");
                            
                            break;
                        }
                    }
                    
                    if (!ditemukan) {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    break;
                    
                case 4:
                    System.out.println();
                    System.out.println("Program Selesai.");
                    break;
                        
                default:
                    System.out.println("Pilihan tidak tersedia");
                    
            }
        }
        
        input.close();
    }
}