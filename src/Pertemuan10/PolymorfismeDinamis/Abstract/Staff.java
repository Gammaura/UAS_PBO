package Pertemuan10.PolymorfismeDinamis.Abstract;

public class Staff extends Pegawai {  
    private String bagian;
    public Staff(String nama, String NIP, String bagian){  
        super(nama,NIP);
        setBagian(bagian);
    }
    
    public void setBagian(String namabagian){  
        bagian=namabagian;
    }
    
    public String getBagian(){
        return bagian;
    }
}
    
