package Pertemuan4;
import java.util.Scanner;

//Program IF dengan dua kondisi
public class CekKelulusan {

    public static void main(String[] args) {
System.out.print("\033[H\033[2J");
        

        //membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("NAMA : "); 
        nama = scan.nextLine();
        System.out.print("NILAI : "); 
        nilai = scan.nextInt();

        //Cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("\nSELAMAT " + nama + ", ANDA LULUS");
        } else {
            System.out.println("\nMAAF " + nama + ", ANDA TIDAK LULUS");
        }

        scan.close();
    }
}