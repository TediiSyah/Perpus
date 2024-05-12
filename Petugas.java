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
public class Petugas {

/**
 *
 * @author pandu
 */
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas() {
        this.namaKaryawan.add("Mas Asep");
        this.alamat.add("Jember utara");
        this.telepon.add("0238214772");
        
        this.namaKaryawan.add("Mas Ari");
        this.alamat.add("Pekalongan");
        this.telepon.add("0753863927");
    }
    
    public void setNama(String namaPetugas) {
        this.namaKaryawan.add(namaPetugas);
    }
    
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    public void setTelpon(String telpon) {
        this.telepon.add(telpon);
    }
    
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
    
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}

