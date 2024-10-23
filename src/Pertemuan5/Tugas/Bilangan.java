package Pertemuan5.Tugas;

import java.util.Scanner;

public class Bilangan {
    
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
		Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        //membuat variabel dan scanner
        int A;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("MASUKKAN SEBUAH ANGKA : ");
        A = scan.nextInt();
        //cek bilangan
        if (A > 0) {
            System.out.println(A + " ADALAH ANGKA POSITIF.");
        }

        if (A < 0) {
            System.out.println(A + " ADALAH ANGKA NEGAITF.");
        } 
        
        if (A == 0) {
            System.out.println(A + " ADALAH ANGKA NOL.");
        } 
        
        scan.close();

    }
}