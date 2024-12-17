package Pertemuan11.OperasiBilangan1;

public class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("PERKALIAN : " + a + " * " + b + " = " + c );
    }
}
