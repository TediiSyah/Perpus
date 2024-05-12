package com.mycompany.latihanukl_perpus;
import java.util.Scanner;
/**
 *
 * @author Tedii
 */
public class Laporan {

Scanner input = new Scanner(System.in);
    private int pilih;
    
    public void laporan(Buku buku) {
        int a = buku.getJumlahBuku();
        int b = 1;
        
        System.out.println("List Buku");
        System.out.println();
        System.out.println("Nama Buku \t\t Stok \t Harga");
        for(int i = 0; i < a; i++) {
            System.out.println(b + ". " + buku.getnamaBuku(i) + "\t\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
            b++;
        }
    }
    
    public void laporan(Siswa siswa) {
        int a = siswa.getJumlahSiswa();
        int b = 1;
        
        System.out.println("List Siswa");
        System.out.println();
        System.out.println("Nama Siswa \t\t Alamat \t\t Telepon \t\t Status");
        for(int i = 0; i < a; i++) {
            System.out.println(b + ". " + siswa.getNama(i) + "\t\t" + siswa.getAlamat(i) + "\t\t" + siswa.getTelepon(i) + "\t\t" + siswa.getStatusKet(i));
            b++;
        }
    }
    
    public void halo(Siswa siswa, Buku buku) {
        int a = siswa.getJumlahSiswa();
        int b = buku.getJumlahBuku();
        
        System.out.println("================================");
        System.out.println("          Ini Perpus");
        System.out.println("================================");
        
        do {
            System.out.print("Masukkan id: ");
            pilih = input.nextInt();
            if(a < pilih) {
                System.out.println("id salah");
            }
        } while (a < pilih);
        
        System.out.println("================================");
        System.out.println("Nama Siswa: " + siswa.getNama(pilih - 1));
        System.out.println("Status: " + siswa.getStatusKet(pilih - 1));
        if(siswa.getStatus(pilih - 1) == false) {
            int c = 0;
            System.out.println("================================");
            System.out.println("Mau balikin buku?");
            System.out.println("1. iya");
            System.out.println("2. tidak");
            
            do {
                System.out.print("Pilih: ");
                c = input.nextInt();
                if(c > 2) {
                    System.out.println("salah");
                }
            } while (c > 2);
            if(c == 2) {
                System.out.println("================================");
                System.out.println("Thanks");
            } else if(c == 1) {
                c = 1;
                System.out.println("================================");
                for(int i = 0; i < b; i++) {
                    System.out.println(c + ". " + buku.getnamaBuku(i));
                    c++;
                }
                do {
                    System.out.print("Pilih: ");
                    c = input.nextInt();
                    if(c > 3) {
                        System.out.println("salah");
                    }
                } while (c > 3);
                System.out.println("================================");
                System.out.println("Thanks");
                System.out.println("================================");
                System.out.println("Data terbaru perpus");
                System.out.println("");
                int d = c - 1;
                c = 1;
                buku.editStok(d, buku.getStok(d) + 1);
                System.out.println("Nama Buku \t Stok \t Harga");
                for(int i = 0; i < a; i++) {
                    System.out.println(c + ". " + buku.getnamaBuku(i) + "\t\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
                    c++;
                }
                System.out.println("================================");
                c = 1;
                siswa.setStatus(d, true);
                System.out.println("Nama Siswa \t Alamat \t\t Telepon \t\t Status");
                for(int i = 0; i < a; i++) {
                    System.out.println(c + ". " + siswa.getNama(i) + "\t\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatusKet(i));
                    c++;
                }
            }
        }
        if(siswa.getStatus(pilih - 1) == true) {
            int c = 0;
            System.out.println("================================");
            System.out.println("Mau pinjam??");
            System.out.println("1. iya");
            System.out.println("2. tidak");
            do {
                System.out.print("Pilih: ");
                c = input.nextInt();
                if(c > 2) {
                    System.out.println("salah");
                }
            } while (c > 2);
            if(c == 2) {
                System.out.println("================================");
                System.out.println("Thanks");
            } else if(c == 1) {
                c = 1;
                System.out.println("================================");
                for(int i = 0; i < b; i++) {
                    System.out.println(c + ". " + buku.getnamaBuku(i));
                    c++;
                }
                do {
                    System.out.print("Pilih: ");
                    c = input.nextInt();
                    if(c > 3) {
                        System.out.println("salah");
                    }
                } while (c > 3);
                System.out.println("================================");
                System.out.println("thanks");
                System.out.println("================================");
                System.out.println("Data terbaru perpus");
                System.out.println();
                int d = c - 1;
                c = 1;
                siswa.setStatus(d, false);
                System.out.println("Nama Siswa \t Alamat \t\t Telepon \t\t Status");
                for(int i = 0; i < a; i++) {
                    System.out.println(c + ". " + siswa.getNama(i) + "\t\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatusKet(i));
                    c++;
                }
            }
        }
    }
}


