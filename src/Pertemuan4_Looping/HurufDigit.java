package Pertemuan4_Looping;
import java.util.Scanner;

public class HurufDigit {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        //membuat variabel dan scanner
        char karakter;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("MASUKKAN KARAKTER : ");
        karakter = scan.next().charAt(0);
        //cek digit
        if ( (karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println(karakter + " ADALAH HURUF.");
        } else if (karakter >= '0' && karakter <= '9') {
            System.out.println(karakter + " ADALAH DIGIT.");
        } else {
            System.out.println(karakter + " BUKAN HURUF ATAU DIGIT.");
        }
        // tutup scanner
        scan.close();
    }
    
}
