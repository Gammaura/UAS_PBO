package Pertemuan5.Tugas;

import java.util.Scanner;

public class InputNol {
    
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner input = new Scanner(System.in);

        while(true) {
        
        System.out.print("\033[H\033[2J");

        //membuat variabel dan scanner
        int B;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("MASUKKAN SEBUAH ANGKA : ");
        B = scan.nextInt();
        //cek bilangan
        if (B == 0) {
            break;
        }

        else {
            continue;
        }

        }

    }
}