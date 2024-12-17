package Pertemuan10.PolymorfismeDinamis.Final;

public final class MyMath {
    // Atribut
    public final double pi = 3.1416;

    // Method
    public final double luasLingkaran(double r) {
        return pi * r * r;
    }

    public final double kelilingLingkaran(double r) {
        return 2 * pi * r;
    }

    public final double sin(double derajat){
        return Math.sin(Math.toRadians(derajat));
    }

    public final double cos(double derajat){
        return Math.cos(Math.toRadians(derajat));
    }

    public final double tan(double derajat){
        return Math.tan(Math.toRadians(derajat));
    }

    public final double pangkat(double a, double b){
        return Math.pow(a, b);
    }
}
