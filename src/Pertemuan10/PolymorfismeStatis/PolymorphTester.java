package Pertemuan10.PolymorfismeStatis;

class Polymorph {
    public int tambah(int x, int y) {
        return x+y;
    }
    public String tambah(String x, String y) {
        return x+ " " +y;
    }
}

public class PolymorphTester {
    public static void main(String[] args) {
        Polymorph p=new Polymorph();
        System.out.println("2 + 3 = " +p.tambah(2, 3));
        System.out.println("\"2\" + \"3\" = " +p.tambah("2", "3"));
    }    
}
