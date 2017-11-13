public class Zooma {

    /**
     * main method merupakan gerbang utama untuk menjalankan java code.
     * Tidak semua class HARUS terdapat main method, namun bukan berarti
     * main method tidak boleh lebih dari satu.
     */
    public static void main(String[] args) {

        /**
         * tipe data pada java ada 2 jenis, primitive dan non-primitive.
         * non primitive adalah semua tipe data dalam bentuk object dan String.
         * tipe data primitive yang sering digunakan antara lain:
         * int, long, float, double, boolean, dan char.
         */

        int x = 5;
        long y = 2_000_000;
        float m = 1.5F; // khusus float harus di akhiri f/F, karena bilangan decimal tanpa f/F akan dianggap sebagai double.
        double n = 2.5;

        System.out.print(x + " " + y + " " + m + " " + n);
    }
}
