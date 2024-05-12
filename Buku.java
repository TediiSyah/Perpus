/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanukl_perpus;
import java.util.ArrayList;

/**
 *
 * @author Tedii
 */
public class Buku {


/**
 *
 * @author pandu
 */

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku() {
        this.namaBuku.add("Buku kimia");
        this.stok.add(10);
        this.harga.add(10000);
        
        this.namaBuku.add("Aku samudra");
        this.stok.add(15);
        this.harga.add(50000);
        
        this.namaBuku.add("Kamus bahasa");
        this.stok.add(20);
        this.harga.add(100000);
    }
    
    public int getJumlahBuku() {
        return this.namaBuku.size();
    }
    
    public void setnamaBuku(String bukuNama) {
        this.namaBuku.add(bukuNama);
    }
    
    public String getnamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }
    
    public void setStok(int stok) {
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }
    
    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);
    }
    
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
    
    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

    
}

