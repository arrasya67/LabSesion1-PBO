/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */


import java.util.ArrayList;

// ==================== POIN 1: CLASS & OBJECT ====================
class Mahasiswa {
    // POIN 1: Atribut
    private String nama;
    private String nim;
    private double ipk;

    // POIN 3: Konstanta >> nilai tidak bisa diubah 
    public static final double IPK_CUMLAUDE = 3.51;

    // POIN 2: Constructor  method khusus ketika objek dibuat fungsi mengisi nilai awal
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // POIN 1: Method 1
    public void tampil() {
        System.out.println(nama + " - " + nim + " - IPK " + ipk);
    }

    // POIN 1: Method 2 + POIN 4: Kondisional
    public String predikat() {
        if (ipk >= IPK_CUMLAUDE) {
            return "Cumlaude";
        } else if (ipk >= 3.00) {
            return "Sangat Memuaskan";
        } else {
            return "Memuaskan";
        }
    }

    // POIN 7: Method String
    public String namaUpper() {
        return nama.toUpperCase();
    }

    public int panjangNama() {
        return nama.length();
    }

    public String getNama() {
        return nama;
    }
}

// ==================== POIN 1: CLASS & OBJECT ====================
public class Lab {
    public static void main(String[] args) {
        // POIN 8: Collection (ArrayList)
        ArrayList<Mahasiswa> daftar = new ArrayList<>();
        daftar.add(new Mahasiswa("Agis Lentera", "L0325022", 3.75));
        daftar.add(new Mahasiswa("Budiono Siregar", "L0325006", 3.60));
        daftar.add(new Mahasiswa("Alex Putra Tama", "L0325016", 3.20));

        System.out.println("=== DATA MAHASISWA ===");

        // POIN 5: Looping
        for (int i = 0; i < daftar.size(); i++) {
            daftar.get(i).tampil();
        }

        // POIN 9: Object dari class Mahasiswa
        Mahasiswa mhs = daftar.get(2);

        // POIN 7: Character & String
        char inisial = mhs.getNama().charAt(0);
        System.out.println("\nInisial: " + inisial);
        System.out.println("Nama Upper: " + mhs.namaUpper());
        System.out.println("Panjang Nama: " + mhs.panjangNama());
        System.out.println("Predikat: " + mhs.predikat());

        // POIN 6: Exception Handling
        try {
            int hasil = 100 / 0; // simulasi error
            System.out.println(hasil);
        } catch (ArithmeticException e) {
            System.out.println("\nError: Tidak bisa membagi dengan nol!");
        }

        System.out.println("\nProgram selesai.");
    }
}