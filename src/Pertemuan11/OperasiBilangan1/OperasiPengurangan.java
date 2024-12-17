package Pertemuan11.OperasiBilangan1;

public class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("PENGURANGAN : " + a + " - " + b + " = " + c );
    }
}
