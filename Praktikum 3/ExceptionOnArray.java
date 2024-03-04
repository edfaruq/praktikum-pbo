/* File : ExceptionOnArray.java */
/* Deskripsi : Program penggunaan eksepsi menggunakan class library Java */
/* NIM / Nama : 24060122140148 / Muhammad Anshar Al Faruq */

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code....");
        }
    }
}