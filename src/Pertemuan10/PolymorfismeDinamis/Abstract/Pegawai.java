package Pertemuan10.PolymorfismeDinamis.Abstract;

public class Pegawai {
    private String NIP;
    private String nama;

    // Constructor untuk inisialisasi nama dan NIP
    public Pegawai(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NIP
    public String getNIP() {
        return NIP;
    }

    // Method untuk mengirim email
    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println(getNama() + " Kirim email ke : " + to);
        System.out.println("Dengan Subjek : " + subjek);
        System.out.println("Dengan Isi : " + isi);
    }
}

