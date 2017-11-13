public class Hero {
    /**
     * modifier private, protected, public merupakan kunci enkapsulasi, penyembunyian informasi.
     * Konsep enkapsulasi adalah agar tidak ada perubahan tanpa kontrol yang dapat menyebabkan
     * masalah pada source code.
     * private : hanya bisa di akses dalam class itu sendiri.
     * protected: hanya bisa di akses dalam satu package / directory.
     * public: dapat diakses oleh semua class meski berbeda package / directory.
     */
    private String name;
    private boolean canFly;

    /**
     * Constructor berfungsi untuk membuat object. apabila sebuah class tidak nampak ada
     * constructor, secara default compiler akan membuat default constructor. Constructor dapat
     * dibuat lebih dari satu.
     */
    public Hero() {}

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }

    /**
     * setter and getter method.
     * setter method berfungsi untuk merubah nilai (selain melalui constructor).
     * getter berfungsi untuk menampilkan nilai (karena variable didefinisikan sebagai private).
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
