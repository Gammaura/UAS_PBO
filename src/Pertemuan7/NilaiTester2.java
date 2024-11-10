package Pertemuan7;

class Nilai {
    private double quiz; // Atribut untuk menyimpan nilai quiz
    private double UTS;  // Atribut untuk menyimpan nilai UTS
    private double UAS;  // Atribut untuk menyimpan nilai UAS

    public void setQuiz(double quiz) { // Setter untuk mengatur nilai quiz dengan validasi
        if (quiz >= 0 && quiz <= 100) {
            this.quiz = quiz;
        } else {
            System.out.println("NILAI QUIS HARUS ANTARA 0 DAN 100");
        }
    }

    public void setUTS(double UTS) { // Setter untuk mengatur nilai UTS dengan validasi
        if (UTS >= 0 && UTS <= 100) {
            this.UTS = UTS;
        } else {
            System.out.println("NILAI UTS HARUS ANTARA 0 DAN 100");
        }
    }

    public void setUAS(double UAS) { // Setter untuk mengatur nilai UAS dengan validasi
        if (UAS >= 0 && UAS <= 100) {
            this.UAS = UAS;
        } else {
            System.out.println("NILAI UAS HARUS ANTARA 0 DAN 100");
        }
    }

    public double getQuiz() { // Getter untuk mendapatkan nilai quiz
        return quiz;
    }

    public double getUTS() { // Getter untuk mendapatkan nilai UTS
        return UTS;
    }

    public double getUAS() { // Getter untuk mendapatkan nilai UAS
        return UAS;
    }

    public double getNA() { // Metode untuk menghitung Nilai Akhir (NA) berdasarkan bobot
        return 0.20 * quiz + 0.30 * UTS + 0.50 * UAS;
    }
}

public class NilaiTester2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Nilai n = new Nilai(); // Membuat objek Nilai

        n.setQuiz(90);         // Menetapkan nilai quiz menjadi 90
        n.setUTS(70);          // Menetapkan nilai UTS menjadi 70
        n.setUAS(150);         // Menetapkan nilai UAS menjadi 150 (akan ditolak karena melebihi batas)

        System.out.println("NILAI QUIZ : " + n.getQuiz());
        System.out.println("NILAI UTS  : " + n.getUTS());
        System.out.println("NILAI UAS   : " + n.getUAS());
        System.out.println("NILAI AKHIR : " + n.getNA()); // Menampilkan Nilai Akhir (NA) berdasarkan bobot nilai
    }
}
