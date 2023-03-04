/*
    Nama    : Wildan Khafichudin
    Nim     : A11.2021.13750
    Matkul  : Pemrograman Berbasis Objek
    Dosen   : IMANUEL HARKESPAN, M.Kom
    Program : Menghitung keliling lingkaran jika
              diketahui diameternya = 10.
    Date    : 4 Maret 2023
*/

public class Kel_Lingkaran {
    public static void main(String[] args) {
        /*
         * KAMUS :
         * -> K = keliling
         * -> d = diameter
         */
        final double phi = 3.14;
        double K, d;
        d = 10;

        K = phi * d;

        System.out.print("Keliling lingkaran = "+K);
    }
}
