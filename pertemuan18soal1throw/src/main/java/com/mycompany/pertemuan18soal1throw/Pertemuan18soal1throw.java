/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal1throw;

/**
 *
 * @author USER
 */
public class Pertemuan18soal1throw {

    public static void main(String[] args) {
         try {
            // Memanggil metode yang mungkin melempar pengecualian
            checkAge(15);
        } catch (IllegalArgumentException e) {
            // Menangkap dan menangani pengecualian IllegalArgumentException
            System.out.println("Terjadi pengecualian: " + e.getMessage());
        }

        System.out.println("Program selesai.");
    }

    // Metode yang melempar pengecualian jika usia kurang dari 18
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus lebih dari 18 tahun.");
        }
        System.out.println("Usia valid: " + age);
    }
}
