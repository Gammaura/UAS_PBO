package Pertemuan10.PolymorfismeDinamis.Static;

public final class MyMath {
    // Atribut
    public static final double pi = 3.14;

    // Method
    public static double kelilingLingkaran(double r) {
        return 2 * pi * r;
    }

    public static double luasLingkaran(double r) {
        return pi * r * r;
    }

    public static double sin(double derajat){
        return Math.sin(Math.toRadians(derajat));
    }

    public static double cos(double derajat){
        return Math.cos(Math.toRadians(derajat));
    }

    public static double tan(double derajat){
        return Math.tan(Math.toRadians(derajat));
    }

    public static double pangkat(double bilangan, int pangkat){
        return Math.pow(bilangan, pangkat);
    }

    public static double getPi() {
        return pi;
    }
}
