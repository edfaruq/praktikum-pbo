/* Program   : Mtitik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas kubus*/
/* NIM/Nama  : 24060122140148/Muhammad Anshar Al Faruq*/
/* Tanggal   : 19 Februari 2024*/

public class Kubus{
    //atribut
    private double Sisi;
    
    //constructor
    public Kubus(double Sisi) {
        this.Sisi = Sisi;
    }

    // Method untuk menghitung volume kubus
    public double hitungVolume() {
        return Math.pow(Sisi, 3);
    }

    // Method untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(Sisi, 2);
    }
}