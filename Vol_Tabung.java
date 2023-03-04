/*
    Nama    : Wildan Khafichudin
    Nim     : A11.2021.13750
    Matkul  : Pemrograman Berbasis Objek
    Dosen   : IMANUEL HARKESPAN, M.Kom
    Program : Menghitung volume tabung jika diketahui
              diameter = 5 dan tinggi = 10.
    Date    : 4 Maret 2023
*/

public class Vol_Tabung {
    public static void main(String[] args){
        /*
         * KAMUS :
         * -> V = volume
         * -> r = diameter
         * -> t = tinggi
         */
        final double phi = 3.14;
        double V, r, t;
        r = 5;
        t = 10;

        V = phi * r * r * t;
        System.out.print("Volume tabung = "+V);
    }
}
