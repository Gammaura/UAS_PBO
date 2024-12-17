package Pertemuan11.Tugas;

// Implement the FoodMenu interface untuk menu minuman
public class Minuman implements FoodMenu {
    @Override
    public void tampilkanMenu() {
        System.out.println("\n  1. KOPI      -   RP 15,000");
        System.out.println("  2. TEH       -   RP 10,000");
        System.out.println("  3. JUS       -   RP 20,000");
    }

    @Override
    public double hitungHarga(String namaItem, int jumlah) {
        double harga = 0;
        switch (namaItem.toLowerCase()) {
            case "KOPI":
                harga = 15000 * jumlah;
                break;
            case "TEH":
                harga = 10000 * jumlah;
                break;
            case "JUS":
                harga = 20000 * jumlah;
                break;
            default:
                System.out.println("INPUT TIDAK VALID.");
        }
        return harga;
    }
}
