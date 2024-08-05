/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pertemuan8soal2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Tahun Akhir?: ");
        int tahunAkhir =  myInput.nextInt();
        
        System.out.println("Tahun Awal?: ");
        int tahunAwal =  myInput.nextInt();
        
        System.out.println("Hasil nya: ");
        
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
}
