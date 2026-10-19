/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */
public class KamarPutribaru extends DataKamar implements BisaDibersihkan {
    
    private boolean fasilitasWifi;
    
    public KamarPutribaru(int nomor, String penghuni, double harga, boolean fasilitasWifi) {
        super(nomor, penghuni, harga);
        this.fasilitasWifi = fasilitasWifi;
    }
    
    @Override
    public void tampilkanFasilitas() {
        System.out.println("Jenis: Putri");
        System.out.println("Wifi: " + (fasilitasWifi ? "Ada" : "Tidak Ada"));
    }
    
    @Override
    public void bersihkanKamar() {
        System.out.println("Kamar putri selesai dibersihkan");
    }
}
