package Pertemuan10.PolymorfismeDinamis.Static;

public class Main
{
    public static void main( String[] args )
    {
        // Tidak perlu instansiasi objek
        System.out.println("Besar PI adalah " + MyMath.pi);
        System.out.println("Keliling lingkaran dengan jari-jari 5 adalah " + MyMath.kelilingLingkaran(5));
        System.out.println("Luas lingkaran dengan jari-jari 5 adalah " + MyMath.luasLingkaran(5));
        System.out.println("Sinus 30 derajat adalah " + MyMath.sin(30));
        System.out.println("Cosinus 30 derajat adalah " + MyMath.cos(30));
        System.out.println("Tangens 30 derajat adalah " + MyMath.tan(30));
        System.out.println("5 pangkat 3 adalah " + MyMath.pangkat(5, 3));
    }
}