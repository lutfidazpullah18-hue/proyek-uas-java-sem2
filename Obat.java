/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttugasakhir;

/**
 *
 * @author user
 */
// Pembuatan Class untuk menerapkan Object Oriented Programming (Pertemuan 2 & 9)
// Konsep pembuatan subclass ini secara spesifik dibahas pada form logika (Pertemuan 10)
public class Obat {
    
    // Pertemuan 2: Variabel dan Tipe Data
    private String kd, nb;
    private double hrg, tot, ub, uk;
    private int jml;

    // Pertemuan 4: Struktur Kontrol Percabangan (If-Else)
    public void setKd(String kode) {
        this.kd = kode;
        if (kode.equals("A1")) {
            this.nb = "Paracetamol Tablet";
            this.hrg = 8000;
        } else if (kode.equals("A2")) {
            this.nb = "Amoxicillin 500mg";
            this.hrg = 15000;
        } else if (kode.equals("A3")) {
            this.nb = "Vitamin C 1000mg";
            this.hrg = 8000;
        } else if (kode.equals("A4")) {
            this.nb = "OBH Combi Sirup";
            this.hrg = 18000;
        } else if (kode.equals("A5")) {
            this.nb = "Promag Tablet";
            this.hrg = 8000;
        } else if (kode.equals("A6")) {
            this.nb = "Sangobion";
            this.hrg = 22000;
        } else {
            this.nb = "Barang Tidak Ditemukan";
            this.hrg = 0;
        }
    }

    // Pertemuan 6: Encapsulation (Getter & Setter)
    public String getNb() { return nb; }
    public double getHrg() { return hrg; }

    public void setJml(int jml) {
        this.jml = jml;
    }

    // Pertemuan 3: Operator Aritmatika (Perkalian)
    public double getTot() {
        this.tot = this.hrg * this.jml;
        return tot;
    }

    public void setUb(double ub) {
        this.ub = ub;
    }
    
    public double getUb() { return ub; }

    // Pertemuan 3: Operator Aritmatika (Pengurangan)
    public double getUk() {
        this.uk = this.ub - this.tot;
        return uk;
    }
}