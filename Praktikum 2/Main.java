/* Program   : Mtitik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas kubus*/
/* NIM/Nama  : 24060122140148/Muhammad Anshar Al Faruq*/
/* Tanggal   : 19 Februari 2024*/


public class Main{
    public static void main(String[] args){
        Kubus Kubus1 = new Kubus(5.0);

        // a. Hitung dan cetak volume dari kubus1
        double volumeKubus1 = Kubus1.hitungVolume();
        System.out.println("Volume Kubus 1: " + volumeKubus1);

        // b. Hitung dan cetak luas permukaan dari kubus1
        double luasPermukaanKubus1 = Kubus1.hitungLuasPermukaan();
        System.out.println("Luas Permukaan Kubus 1: " + luasPermukaanKubus1);
    }
}