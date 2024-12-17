package Pertemuan10.PolymorfismeDinamis.Interface;

public class PersegiPanjang implements Bidang2D {
    public double panjang;
    public double lebar;

    public double getKeliling() {
        return 2*(panjang + lebar);
    }
    
    public double getLuas() {
        return panjang*lebar;
    }
}
