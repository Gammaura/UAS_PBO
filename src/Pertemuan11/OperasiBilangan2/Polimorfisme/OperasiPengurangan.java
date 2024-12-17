package Pertemuan11.OperasiBilangan2.Polimorfisme;

import Pertemuan11.OperasiBilangan2.Abstract.OperasiBilanganAbs;

public class OperasiPengurangan extends OperasiBilanganAbs {

    @Override
    public void set_A(double a) {
        this.a = a;
    }

    @Override
    public void set_B(double b) {
        this.b = b;
    }

    @Override
    public void set_C() {
        this.c = this.a - this.b;
    }

    @Override
    public double get_A() {
        return this.a;
    }

    @Override
    public double get_B() {
        return this.b;
    }

    @Override
    public double get_C() {
        return this.c;
    }

    @Override
    public void tampil() {
        System.out.println("HASIL PENGURANGAN : " + this.get_C());
    }
}
