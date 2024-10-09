package Pertemuan4;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);
        System.out.print("MASUKKAN BILANGAN : ");
        int bilangan = input.nextInt();

        int faktorial = 1;
        int i = bilangan;

        //looping untuk menghitung faktorial
        while (i > 0) {
            faktorial *= i;
            i--;
        }

        System.out.println("FAKTORIAL DARI " + bilangan + " ADALAH : " + faktorial);
        input.close();
    }
}
