package Pertemuan9_Inheritence.Pegawai;

public class Manager extends Pegawai {
    
    @Override
    public void menampilkan() 
    {   
        System.out.println("NAMA : " + nama);
        System.out.println("ID PEGAWAI : " + id_pegawai);
        System.out.println("GAJI : " + gaji);
    }
    
    public void tugas() {
        System.out.println("TUGAS : MELAKUKAN MANAJEMEN UNTUK FRANCHISE.");
        System.out.println();
    }
}
