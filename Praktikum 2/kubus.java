/* Program   : kubus.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas produk dan penjual*/
/* NIM/Nama  : 24060122140148/Muhammad Anshar Al Faruq*/
/* Tanggal   : 28 Februari 2024*/
class Kubus {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}