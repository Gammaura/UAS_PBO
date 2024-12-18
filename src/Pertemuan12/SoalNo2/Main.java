package Pertemuan12.SoalNo2;

interface Transportasi {
    void tampil();
    void setData();
    int getId();
}

// Superclass: Gojek
class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    public Gojek() {
        this.harga = 0;
        this.id = 0;
    }

    @Override
    public void tampil() {
        System.out.println("GOJEK - HARGA : " + harga + ", ID: " + id);
    }

    @Override
    public void setData() {
        this.harga = 20000; // Contoh data
        this.id = 123;
    }

    @Override
    public int getId() {
        return id;
    }
}

// Subclass: Bayar
class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar() {
        super();
        this.jarak = 10; // Contoh jarak
        this.nama = "PENGGUNA GOJEK";
        this.total = jarak * 2000; // Perhitungan total biaya
    }

    public Bayar(int id) {
        this();
        this.id = id;
        System.out.println("BAYAR DENGAN ID : " + this.id);
    }

    @Override
    public void tampil() {
        System.out.println("NAMA : " + nama);
        System.out.println("JARAK : " + jarak + " KM");
        System.out.println("TOTAL BAYAR : RP." + total);
        System.out.println("ID GOJEK : " + id);
    }

    @Override
    public void setData() {
        super.setData();
        this.total = jarak * 2000;
        System.out.println("DATA BAYAR SUDAH DISET.");
    }

    @Override
    public int getId() {
        return id;
    }
}

// Main Program
public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        System.out.println("==|| GOJEK ||==");
        Gojek gojek = new Gojek();
        gojek.setData();
        gojek.tampil();

        System.out.println("\n==|| BAYAR ||==");
        Bayar bayar = new Bayar(456);
        bayar.setData();
        bayar.tampil();
    }
}
