package Pertemuan4;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        //membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("MASUKKAN NILAI : ");
        nilai = scan.nextInt();
        //cek grade
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        //tampilkan grade
        System.out.println("GRADE : " + grade);
        // tutup scanner
        scan.close();
    }
    
}
