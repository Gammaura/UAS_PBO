package Pertemuan11.OperasiBilangan1;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("PENJUMLAHAN : " + a + " + " + b + " = " + c );
    }
}
