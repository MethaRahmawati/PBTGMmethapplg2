/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pertemuan11soal1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        // Input data karyawan
        System.out.println("Masukkan ID Karyawan: ");
        String idKaryawan = myInput.nextLine();

        System.out.println("Masukkan Nama Karyawan: ");
        String namaKaryawan = myInput.nextLine();

        System.out.println("Masukkan Golongan: ");
        String golongan = myInput.nextLine();

        System.out.println("Masukkan Jabatan: ");
        String jabatan = myInput.nextLine();

        System.out.println("Masukkan Gaji Pokok: ");
        double gajiPokok = myInput.nextDouble();

        // Membuat objek Karyawan dengan data yang diinput
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);

        // Menampilkan data karyawan
        System.out.println("\nData Karyawan");
        karyawan.tampilkanData();
    }
}