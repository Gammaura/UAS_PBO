package Pertemuan11.OperasiBilangan1;

public class OperasiPembagian extends OperasiBilangan {

    @Override
    protected void tampil() {
        if (b != 0) {
            c = a / b;
            System.out.println("PEMBAGIAN : " + a + " / " + b + " = " + c);
        }
        else {
            System.out.println("TIDAK DAPAT MEMBAGI DENGAN NOL.");
        }
    }
}
