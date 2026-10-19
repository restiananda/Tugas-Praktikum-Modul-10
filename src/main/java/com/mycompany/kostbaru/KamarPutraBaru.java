/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */

public class KamarPutraBaru extends DataKamar implements BisaDipesan{
    
    private boolean fasilitasAC;
    
    public KamarPutraBaru(int nomor, String penghuni, double harga, boolean fasilitasAC) {
        super(nomor, penghuni, harga);
        this.fasilitasAC = fasilitasAC;
    }
    
    @Override
    public void tampilkanFasilitas() {
        System.out.println("Jenis: Putra");
        System.out.println("AC: " + (fasilitasAC ? "Ada" : "Tidak Ada"));
    }
    
    @Override
    public void pesanKamar() {
        System.out.println("Kamar puta baru berhasil dipesan");
    }
}