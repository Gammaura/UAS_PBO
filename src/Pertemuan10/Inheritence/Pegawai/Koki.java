package Pertemuan10.Inheritence.Pegawai;

public class Koki extends Pegawai {

    @Override
    public void menampilkan() 
    {
        System.out.println("NAMA : " + nama);
        System.out.println("ID PEGAWAI : " + id_pegawai);
        System.out.println("GAJI : " + gaji);
    }

    public void tugas() {
        System.out.println("TUGAS : MEMASAK MAKANAN DAN MEMBUAT MINUMAN.");
        System.out.println();
    }
}
