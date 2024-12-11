package Pertemuan8_Inheritence.Hewan;

public class Main {
        public static void main(String[] args) {

            System.out.print("\033[H\033[2J");
            
            Sapi sp1 = new Sapi();
            sp1.cetak();
            System.out.println("");
    
            Kambing kmb1 = new Kambing();
            kmb1.cetak();
            System.out.println("");
    
            Burung brg1 = new Burung();
            brg1.cetak();
            System.out.println("");
    
            Ayam aym1 = new Ayam();
            aym1.cetak();
            System.out.println("");
    
            Gurami grm1 = new Gurami();
            grm1.cetak();
            System.out.println("");
    
            Lele ll1 = new Lele();
            ll1.cetak();
            System.out.println("");
        }
}
