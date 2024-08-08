/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal1trycatch;

/**
 *
 * @author USER
 */
public class Pertemuan18soal1trycatch {

    public static void main(String[] args) {
         int[] numbers = {1, 2, 3};

        try {
            // Mengakses elemen ke-5 yang tidak ada di array
            System.out.println("Elemen ke-5: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangkap dan menangani pengecualian ArrayIndexOutOfBoundsException
            System.out.println("Terjadi pengecualian: " + e.getMessage());
        }

        System.out.println("Program selesai.");
    }
}
