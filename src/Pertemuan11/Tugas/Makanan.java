package Pertemuan11.Tugas;

// Implement the FoodMenu interface untuk menu makanan
public class Makanan implements FoodMenu {
    @Override
    public void tampilkanMenu() {
        
        System.out.println("\n  1. BURGER    -   RP 25,000");
        System.out.println("  2. PIZZA     -   RP 40,000");
        System.out.println("  3. SANDWICH  -   RP 20,000");
    }

    @Override
    public double hitungHarga(String namaItem, int jumlah) {
        double harga = 0;
        switch (namaItem.toLowerCase()) {
            case "BURGER":
                harga = 25000 * jumlah;
                break;
            case "PIZZA":
                harga = 40000 * jumlah;
                break;
            case "SANDIWCH":
                harga = 20000 * jumlah;
                break;
            default:
                System.out.println("INPUT TIDAK VALID.");
        }
        return harga;
    }
}


