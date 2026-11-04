/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */
public class TransaksiKost {
    
    public void prosesTransaksi(Penghuni penghuni, DataKamar kamar) {

        System.out.println("\n=== TRANSAKSI KOST ===");

        if (penghuni == null) {
            System.out.println("Transaksi gagal: penghuni tidak ditemukan.");
            return;
        }

        if (kamar == null) {
            System.out.println("Transaksi gagal: kamar tidak ditemukan.");
            return;
        }

        System.out.println("Nama penghuni: " + penghuni.getNama());
        System.out.println("Nomor kamar: " + kamar.getNomor());
        System.out.println("Harga kamar: Rp" + kamar.getHarga());
        System.out.println("Status transaksi: Berhasil");
    }
}