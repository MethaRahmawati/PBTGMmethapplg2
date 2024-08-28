/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal1throw;

/**
 *
 * @author USER
 */
public class Pertemuan18soal1throw {
    
    //function mencheck jika seseorang eligible untuk vote atau tidak

    public static void validate(int age) {
        if (age < 17) {
            //throw Arithmetic exception jika tidak eligible 
            throw new ArithmeticException(
            "Orang ini Belum eligible untuk vote");
        } 
        else {
     System.out.println(
            " Orang ini sudah eligible untuk vote!!"); 
        }
    }
    //main method
    public static void main(String[] args) {
         //calling the function 
        validate(13);
        System.out.println("rest of the code...");
    }
}
