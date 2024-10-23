package Pertemuan6;

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil (String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public Mobil() {
    }

    void cekKecepatan() {
        if (kecepatan == 0)
            aktifitas = "PARKIR";
    }

    void cetakAtribut() {
        System.out.println ("AKTIFITAS = " +  aktifitas);
        System.out.println("WARNA = " + warna);
        System.out.println("KECEPATAN = " + kecepatan);
    }
}
 public class ClassMobil {
    public static void main(String []args) {

        System.out.print("\033[H\033[2J");

        Mobil mobilku = new Mobil();
        mobilku.kecepatan = 0;
        mobilku.warna = "MERAH";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }    
}