package Pertemuan7;

public class NilaiTester {
    // Kelas Nilai
    static class Nilai {
        // Atribut
        private double quis;
        private double uts;
        private double uas;

        // Setter untuk atribut
        public void setQuis(double quis) {
            this.quis = quis;
        }

        public void setUTS(double uts) {
            this.uts = uts;
        }

        public void setUAS(double uas) {
            this.uas = uas;
        }

        // Getter untuk atribut
        public double getQuis() {
            return quis;
        }

        public double getUTS() {
            return uts;
        }

        public double getUAS() {
            return uas;
        }

        // Metode untuk menghitung nilai akhir (NA)
        public double getNA() {
            return (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
        }

        // Metode untuk mendapatkan index nilai
        public char getIndex() {
            double na = getNA();
            if (na >= 80 && na <= 100) {
                return 'A';
            } else if (na >= 68 && na < 80) {
                return 'B';
            } else if (na >= 56 && na < 68) {
                return 'C';
            } else if (na >= 45 && na < 56) {
                return 'D';
            } else {
                return 'E';
            }
        }

        // Metode untuk mendapatkan keterangan berdasarkan index
        public String getKeterangan() {
            switch (getIndex()) {
                case 'A':
                    return "SANGAT BAIK";
                case 'B':
                    return "BAIK";
                case 'C':
                    return "CUKUP";
                case 'D':
                    return "KURANG";
                case 'E':
                    return "SANGAT KURANG";
                default:
                    return "TIDAK ADA";
            }
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Nilai n = new Nilai();
        n.setQuis(60);
        n.setUTS(80);
        n.setUAS(75);

        System.out.println("QUIS        : " + n.getQuis());
        System.out.println("UTS         : " + n.getUTS());
        System.out.println("UAS         : " + n.getUAS());
        System.out.println("NILAI AKHIR : " + n.getNA());
        System.out.println("INDEX       : " + n.getIndex());
        System.out.println("KETERANGAN  : " + n.getKeterangan());
    }
}