package Pertemuan4_Looping;

public class BilanganPrima {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        int batasBawah = 2, batasAtas = 30;

        System.out.println("BILANGAN PRIMA ANTARA " + batasBawah + " DAN " + batasAtas + " ADALAH : ");

        //looping untuk tiap bilangan
        for (int i = batasBawah; i <= batasAtas; i++) {
            boolean prima = true;

            //looping untuk cek bilangan prima
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
    
}
