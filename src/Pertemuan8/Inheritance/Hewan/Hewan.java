package Pertemuan8.Inheritance.Hewan;

public class Hewan {
    protected String suara;

        public Hewan(){
            this.suara = "suara";
        }

        public void cetak(){
            System.err.println("Hewan Bersuara" +suara);
        }
}

class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak = "Beranak";
    }

    public void cetak(){
        System.out.println("Mamalia Berkembang Biak" +berkembangbiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi(){
        suara = "Hemoh...";
        berkembangbiak = "Beranak";
        this.nama = "Sopi";
        this.umur = "1";
    }

    public void cetak(){
        System.out.println("========== Data Hewan Mamalia Sapi ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Berkembang Biak: " +berkembangbiak);
        System.out.println("Nama: " +nama);
        System.out.println("Umur: " +umur+ "Tahun");
    }
}

class Kambing extends Mamalia {
    private String nama;
    private String umur;

    public Kambing(){
        suara = "Embek...";
        berkembangbiak = "Beranak";
        this.nama = "Si ling";
        this.umur = "2";
    }

    public void cetak(){
        System.out.println("========== Data Hewan Mamalia Kambing ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Berkembang Biak: " +berkembangbiak);
        System.out.println("Nama: " +nama);
        System.out.println("Umur: " +umur+ "Tahun");
    }
}

class Unggas extends Hewan {
    protected String berkembangBiak;

    public Unggas(){
        this.berkembangBiak = "Bertelur";
    }

    public void cetak(){
        System.out.println("Bertelur");
    }
}

class Burung extends Unggas {
    private String jenis;
    private String ciri;

    public Burung (){
        suara = "Mbekur...";
        berkembangBiak = "Bertelur";
        this.jenis = "Merpati";
        this.ciri = "Bulu Putih";
    }

    public void cetak(){
        System.out.println("========== Data Hewan Unggas Burung ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Berkembang Biak: " +berkembangBiak);
        System.out.println("Jenis: " +jenis);
        System.out.println("Ciri: " +ciri);
    }
}

class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam(){
        suara = "Petok-Petok...";
        berkembangBiak = "Bertelur";
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu Bercorak Putih Hitam";
    }

    public void cetak(){
        System.out.println("========== Data Hewan Unggas Burung ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Berkembang Biak: " +berkembangBiak);
        System.out.println("Jenis: " +jenis);
        System.out.println("Ciri: " +ciri);
    }
}

class Ikan extends Hewan {
    protected String napas;

    public Ikan(){
        this.napas = "Insang";
    }

    public void cetak(){
        System.out.println("Insang");
    }
}

class Gurami extends Ikan {
    private String Ciri;
    private String Berat;

    public Gurami(){
        suara = "---";
        napas = "Insang";
        this.Ciri = "Berwarna Hitam";
        this.Berat = "2";
    }

    public void cetak(){
        System.out.println("========== Data Hewan Ikan Gurami ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Bernapas: " +napas);
        System.out.println("Ciri: " +Ciri);
        System.out.println("Berat: " +Berat+ "Kg");
    }
}

class Lele extends Ikan {
    private String Ciri;
    private String Berat;

    public Lele(){
        suara = "---";
        napas = "Insang";
        this.Ciri = "Berwarna Hitam Keputihan";
        this.Berat  = "3";
    }
    public void cetak(){
        System.out.println("========== Data Hewan Ikan Lele ==========");
        System.out.println("Suara: " +suara);
        System.out.println("Bernapas: " +napas);
        System.out.println("Ciri: " +Ciri);
        System.out.println("Berat: " +Berat+ "Kg");
    }   
}