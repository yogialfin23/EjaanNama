package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        int panjang;
        char huruf;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length();

        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");

        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
}
