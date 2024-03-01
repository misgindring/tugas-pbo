public class main {

    // LUAS SEGITIGA
    public static void main(String[] args) throws Exception {

        System.out.println("***Program Menghitung luas Segitiga!***\n");

        double alas, tinggi, luas_segitiga; // deklarasi variabel dengan tipe data double

        alas = 5.0;

        tinggi = 10.0;

        luas_segitiga = 0.5 * alas * tinggi;

        System.out.printf("Luas segitiga adalah: %.2f%n\n", luas_segitiga);

        System.out.println("***Program penghitung luas segitiga selesai***\n");

        // LUAS LINGKARAN
        System.out.println("***Program Menghitung luas Lingkaran!***\n");

        double jari_jari, luas_lingkaran;
        jari_jari = 3;

        luas_lingkaran = Math.PI * (jari_jari * jari_jari);

        System.out.printf("Luas lingkaran adalah :%.2f\n", luas_lingkaran);

        System.out.println("***Program penghitung luas lingkaran selesai***\n");

        // LUAS BUJUR SANGKAR
        System.out.println("***Program Menghitung luas Bujur Sangkar!***\n");

        double sisi, luas_bujursangkar;
        sisi = 6;

        luas_bujursangkar = sisi * sisi;

        System.out.printf("Luas Bujursangkar adalah :%.2f\n", luas_bujursangkar);

        System.out.println("***Program penghitung luas Bujursangkar selesai***\n");

        // LUAS PERSEGI PANJANG
        System.out.println("***Program Menghitung luas Bujur Sangkar!***\n");

        double panjang, lebar, luas_persegipanjang;
        panjang = 6;
        lebar = 4;

        luas_persegipanjang = panjang * lebar;

        System.out.printf("Luas persegi panjang adalah :%.2f\n", luas_persegipanjang);

        System.out.println("***Program penghitung luas persegi panjang selesai***\n");

    }
}
