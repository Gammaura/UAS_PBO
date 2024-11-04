package Pertemuan7;

public class Mobil {
    public String merk;
    protected int tahunProduksi;
    private double harga;

    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        } else {
            System.out.println("HARGA HARUS LEBIH BESAR DARI 0");
        }
    }

    public void tampilkanInfoMobil() {
        System.out.println("MERK : " + merk);
        System.out.println("TAHUN PRODUKSI : " + tahunProduksi);
        System.out.println("HARGA : " + harga);
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");


        Mobil mobil1 = new Mobil("TOYOTA", 2022, 30000000);
        System.out.println("MERK MOBIL : " + mobil1.merk);
        System.out.println("TAHUN PRODUKSI MOBIL : " + mobil1.tahunProduksi);
        System.out.println("HARGA MOBIL : " + mobil1.getHarga());

        mobil1.setHarga(35000000);
        System.out.println("HARGA MOBIL SETELAH DIUBAH : " + mobil1.getHarga());

        mobil1.tampilkanInfoMobil();
    }
}