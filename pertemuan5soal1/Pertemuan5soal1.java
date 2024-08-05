/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5soal1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pertemuan5soal1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Nama Anda:");
        // String input
        String name = myInput.nextLine();
        System.out.println("Masukan Alamat Anda:");
        // String input
        String alamat = myInput.nextLine();
        // Numerical input
        System.out.println("Masukan Usia Anda:");
        int usia = myInput.nextInt();
        System.out.println("Masukan Gaji Anda:");
        double salary = myInput.nextDouble();
        // Output input by user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ### ");
        System.out.println("Nama Karyawan: " + name);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: " + salary);
    }
}

