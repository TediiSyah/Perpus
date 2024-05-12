/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl_perpus;

/**
 *
 * @author Tedii
 */
public class Main {

    public static void main(String[] args) {
    
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();
        
        System.out.println("================================");
        laporan.laporan(buku);
        System.out.println("================================");
        laporan.laporan(siswa);
        laporan.halo(siswa, buku);
    }
    
}
    


