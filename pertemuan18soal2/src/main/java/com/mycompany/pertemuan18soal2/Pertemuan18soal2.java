/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal2;

/**
 *
 * @author USER
 */
public class Pertemuan18soal2 {

    public static void main(String[] args) {
        try {
        //below code do not throw any exception 
            Float data;
            data = 500f/ 15;
            System.out.println(data);
        } 
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("blok finally akan selalu di eksekusi "); 
        }
    }
}