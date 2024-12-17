package Pertemuan11.OperasiBilangan1;

public class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) { this.a = a; }
    protected void set_B(double b) { this.b = b; }
    protected void set_C(double c) { this.c = c; } 
    protected double get_A() { return a; }
    protected double get_B() { return b; }
    protected double get_C() { return c; }

    protected void tampil() {
        System.out.println("HASIL OPERASI : " + c);
    }
}
