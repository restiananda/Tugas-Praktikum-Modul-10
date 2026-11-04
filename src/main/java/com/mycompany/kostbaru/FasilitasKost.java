/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */
public class FasilitasKost {
    
    private String namaFasilitas;
    private String lokasi;
    private boolean tersedia;

    public FasilitasKost(String namaFasilitas, String lokasi,
            boolean tersedia) {
        this.namaFasilitas = namaFasilitas;
        this.lokasi = lokasi;
        this.tersedia = tersedia;
    }

    public void tampilkanFasilitas() {
        System.out.println("Nama fasilitas: " + namaFasilitas);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak tersedia"));
    }
}