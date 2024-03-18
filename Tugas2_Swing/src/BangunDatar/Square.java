package BangunDatar;

/**
 *
 * @author DELL
 */
public class Square implements Operation {
    private double panjang, lebar, tinggi; // Menambahkan tinggi untuk balok

    public Square(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double Luas() {
        return panjang * lebar;
    }

    @Override
    public double Keliling() {
        return 2 * (panjang + lebar);
    }

    // Menambahkan fungsi untuk menghitung volume balok
    public double Volume() {
        return panjang * lebar * tinggi;
    }

    // Menambahkan fungsi untuk menghitung luas permukaan balok
    public double LuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
