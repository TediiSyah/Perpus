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
public class Siswa {


/**
 *
 * @author pandu
 */
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa() {
        this.namaSiswa.add("Bruce Wayne");
        this.alamat.add("Gotham");
        this.telepon.add("08216667769");
        this.status.add(true);
        
        this.namaSiswa.add("Mc Gregor");
        this.alamat.add("Kawi");
        this.telepon.add("08212345098");
        this.status.add(true);
        
        this.namaSiswa.add("Celvin Win");
        this.alamat.add("Pucung");
        this.telepon.add("08666444222");
        this.status.add(true);
    }
    
    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
    
    public void setStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }
    
    public String getStatusKet(int idSiswa) {
        if(this.status.get(idSiswa)) {
            return "Bisa minjam";
        } else {
            return "Gak bisa mas";
        }
    }
    
    public int getJumlahSiswa() {
        return this.namaSiswa.size();
    }
    
    public void setNama(String siswaNama) {
        this.namaSiswa.add(siswaNama);
    }
    
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    public void setTelpon(String Telpon) {
        this.telepon.add(Telpon);
    }
    
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
    
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
    
}

