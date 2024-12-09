package Pertemuan10_Inheritence.Pegawai;

public class Satpam extends Pegawai {

    public void menampilkan() 
    {
        System.out.println("NAMA : " + nama);
        System.out.println("ID PEGAWAI : " + id_pegawai);
        System.out.println("GAJI : " + gaji);
    }

    public void tugas() {
        System.out.println("TUGAS : MENJAGA KEAMANAN DI DALAM DAN DI LUAR FRANCHISE.");
        System.out.println();
    }
}