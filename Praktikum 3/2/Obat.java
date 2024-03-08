/* File : Obat.java */
/* Deskripsi : Program untuk menunjukkan Exception */
/* Nama/Nim : Muhammad Anshar Al Faruq /24060122140148 */

package tugas2;
public class Obat {
    private String nama;
    private boolean tersedia;

    public Obat(String nama) {
        this.nama = nama;
        tersedia = true;
    }

    public String getNama() {
        return nama;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
