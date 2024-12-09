package Pertemuan9_Inheritence.Hewan;

public class Hewan {
    protected String suara;

        public Hewan(){
            this.suara = "SUARA";
        }

        public void cetak(){
            System.err.println("HEWAN BERSUARA" +suara);
        }
}

class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak = "BERANAK";
    }

    public void cetak(){
        System.out.println("MAMALIA BERKEMBANG BIAK" +berkembangbiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi(){
        suara = "MOOOOOHHH";
        berkembangbiak = "BERANAK";
        this.nama = "AVRI";
        this.umur = "1";
    }

    public void cetak(){
        System.out.println("DATA HEWAN MAMALIA SAPI");
        System.out.println();
        System.out.println("SUARA : " + suara);
        System.out.println("BERKEMBANG BIAK : " + berkembangbiak);
        System.out.println("NAMA : " + nama);
        System.out.println("UMUR : " + umur + "TAHUN");
    }
}

class Kambing extends Mamalia {
    private String nama;
    private String umur;

    public Kambing(){
        suara = "MBEEEKKK";
        berkembangbiak = "BERANAK";
        this.nama = "TEGAR";
        this.umur = "2";
    }

    public void cetak(){
        System.out.println("DATA HEWAN MAMALIA KAMBING");
        System.out.println("SUARA : " + suara);
        System.out.println("BERKEMBANG BIAK : " + berkembangbiak);
        System.out.println("NAMA : " + nama);
        System.out.println("UMUR : " + umur + "TAHUN");
    }
}

class Unggas extends Hewan {
    protected String berkembangBiak;

    public Unggas(){
        this.berkembangBiak = "BERTELUR";
    }

    public void cetak(){
        System.out.println("BERTELUR");
    }
}

class Burung extends Unggas {
    private String jenis;
    private String ciri;

    public Burung (){
        suara = "MBEEKURR";
        berkembangBiak = "BERTELUR";
        this.jenis = "MERPATI";
        this.ciri = "BULU PUTIH";
    }

    public void cetak(){
        System.out.println("DATA HEWAN UNGGAS BURUNG");
        System.out.println("SUARA : " + suara);
        System.out.println("BERKEMBANG BIAK : " + berkembangBiak);
        System.out.println("JENIS : " + jenis);
        System.out.println("CIRI : " + ciri);
    }
}

class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam(){
        suara = "POKK POKK PETOKK";
        berkembangBiak = "BERTELUR";
        this.jenis = "AYAM KAMPUNG";
        this.ciri = "BULU BERCORAK PUTIH HITAM";
    }

    public void cetak(){
        System.out.println("DATA HEWAN UNGGAS AYAM");
        System.out.println("SUARA : " + suara);
        System.out.println("BERKEMBANG BIAK : " + berkembangBiak);
        System.out.println("JENIS : " + jenis);
        System.out.println("CIRI : " + ciri);
    }
}

class Ikan extends Hewan {
    protected String napas;

    public Ikan(){
        this.napas = "INSANG";
    }

    public void cetak(){
        System.out.println("INSANG");
    }
}

class Gurami extends Ikan {
    private String Ciri;
    private String Berat;

    public Gurami(){
        suara = "(SUARA HATI)";
        napas = "INSANG";
        this.Ciri = "BERWARNA HITAM";
        this.Berat = "2";
    }

    public void cetak(){
        System.out.println("DATA HEWAN IKAN GURAMI");
        System.out.println("SUARA : " + suara);
        System.out.println("BERNAFAS : " + napas);
        System.out.println("CIRI : " + Ciri);
        System.out.println("BERAT : " + Berat + "KG");
    }
}

class Lele extends Ikan {
    private String Ciri;
    private String Berat;

    public Lele(){
        suara = "---";
        napas = "INSANG";
        this.Ciri = "BERWARNA HITAM KEPUTIHAN";
        this.Berat  = "3";
    }
    public void cetak(){
        System.out.println("DATA HEWAN IKAN LELE");
        System.out.println("SUARA : " + suara);
        System.out.println("BERNAFAS : " + napas);
        System.out.println("CIRI : " + Ciri);
        System.out.println("BERAT : " + Berat + "KG");
    }   
}
