package Pertemuan10.PolymorfismeDinamis.Final;

public class Main 
{
    public static void main( String[] args )
    {
        // Instance object
        MyMath mm = new MyMath();
        System.out.println("Luas Lingkaran = " + mm.luasLingkaran(5));
        System.out.println("Keliling Lingkaran = " + mm.kelilingLingkaran(5));
        System.out.println("Sin 30 derajat = " + mm.sin(30));
        System.out.println("Cos 30 derajat = " + mm.cos(30));
        System.out.println("Tan 30 derajat = " + mm.tan(30));
        System.out.println("2^8 = " + mm.pangkat(2, 8));
    }
}
