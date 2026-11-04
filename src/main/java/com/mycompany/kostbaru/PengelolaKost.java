/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author resti
 */
public class PengelolaKost {

    private ArrayList<DataKamar> daftarKamar;
    private HashMap<String, Penghuni> dataPenghuni;
    private FasilitasKost fasilitas;

    public PengelolaKost() {
        daftarKamar = new ArrayList<>();
        dataPenghuni = new HashMap<>();

        fasilitas = new FasilitasKost(
                "Ruang Laundry",
                "Area belakang kost",
                true
        );
    }

    public void tambahKamar(DataKamar kamar) {
        daftarKamar.add(kamar);
        System.out.println("Data kamar berhasil ditambahkan.");
    }

    public DataKamar cariKamar(int nomor) {
        for (DataKamar kamar : daftarKamar) {
            if (kamar.getNomor() == nomor) {
                return kamar;
            }
        }

        return null;
    }

    public void tampilkanSemuaKamar() {
        System.out.println("\n=== DAFTAR KAMAR ===");

        for (DataKamar kamar : daftarKamar) {
            System.out.println("--------------------");
            kamar.tampilkanInfo();
        }

        System.out.println("Jumlah kamar: " + daftarKamar.size());
    }

    public void tambahPenghuni(Penghuni penghuni) {
        dataPenghuni.put(penghuni.getId(), penghuni);
        System.out.println("Data penghuni berhasil ditambahkan.");
    }

    public Penghuni cariPenghuni(String id) {
        return dataPenghuni.get(id);
    }

    public void tampilkanSemuaPenghuni() {
        System.out.println("\n=== DAFTAR PENGHUNI ===");

        if (dataPenghuni.isEmpty()) {
            System.out.println("Belum ada data penghuni.");
            return;
        }

        for (String id : dataPenghuni.keySet()) {
            Penghuni penghuni = dataPenghuni.get(id);
            penghuni.tampilkanInfo();
            System.out.println("--------------------");
        }

        System.out.println("Jumlah penghuni: " + dataPenghuni.size());
    }

    public void tampilkanFasilitas() {
        System.out.println("\n=== FASILITAS KOST ===");
        fasilitas.tampilkanFasilitas();
    }
}