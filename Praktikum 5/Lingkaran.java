/* Nama File : Lingkaran.java */
/* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran */
/* Nama / NIM : Muhammad Anshar Al Faruq / 24060122140148 */


import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
