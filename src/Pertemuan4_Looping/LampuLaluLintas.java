package Pertemuan4_Looping;

import java.util.Scanner;

//Program SWITCH
public class LampuLaluLintas {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        
        //Membuat Variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //Mengambil Input
        System.out.print("MASUKKAN WARNA : ");
        lampu = scan.nextLine();

        switch (lampu) {

            case "MERAH":
            case "merah":
                System.out.println("LAMPU MERAH, BERHENTI!");
                break;

            case "KUNING":
            case "kuning":
                System.out.println("LAMPU KUNING, HARAP HATI-HATI!");
                break;

            case "hijau":
                System.out.println("LAMPU HIJAU, SILAHKAN JALAN!");
                break;

            default:
                System.out.println("WARNA LAMPU TIDAK SESUAI");

        }

        scan.close();
    }
}