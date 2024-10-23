package Pertemuan5.Tugas;

import java.util.Scanner;

@SuppressWarnings("unused")
public class JumlahGenap {
    
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        int Jumlah = 0;
        int i;

        for (i=1; i<=100; i++){

            if (i%2==0){
                Jumlah += i * 2;
            }
        }

        System.out.println("JUMLAH : " + Jumlah);

    }
}