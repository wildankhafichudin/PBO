/*
    Nama    : Wildan Khafichudin
    Nim     : A11.2021.13750
    Matkul  : Pemrograman Berbasis Objek
    Dosen   : IMANUEL HARKESPAN, M.Kom
    Program : Menghitung luas segitiga siku-siku
              jika diketahui alas = 6 dan tinggi = 8.
    Date    : 4 Maret 2023
*/

public class L_Segitiga_siku {
    public static void main(String[] args) {
        /*
         * KAMUS :
         * -> L = luas
         * -> a = alas
         * -> t = tinggi
         */
        double L, a, t;
        a = 6;
        t = 8;

        L = 0.5 * (a * t);
        System.out.print("Luas segitiga siku-siku = "+L);
    }
}
