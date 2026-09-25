package Tugas;

public class Keyboard {

    // Atribut
    private String merek;
    private int jumlahTombol;

    // Method 1
    public void tekanTombol(String tombol) {
        if (tombol == null || tombol.isEmpty()) {
            System.out.println("Tombol tidak boleh kosong.");
        } else {
            System.out.println(
                "Tombol [" + tombol + "] pada keyboard "
                + merek + " ditekan."
            );
        }
    }

    // Method 2
    public void cekJumlahTombol() {
        if (jumlahTombol >= 100) {
            System.out.println(
                "Keyboard memiliki " + jumlahTombol
                + " tombol dan termasuk keyboard full-size."
            );
        } else if (jumlahTombol >= 60) {
            System.out.println(
                "Keyboard memiliki " + jumlahTombol
                + " tombol dan termasuk keyboard compact."
            );
        } else {
            System.out.println(
                "Keyboard memiliki " + jumlahTombol
                + " tombol dan berukuran kecil."
            );
        }
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI KEYBOARD ===");
        System.out.println("Merek         : " + merek);
        System.out.println("Jumlah Tombol : " + jumlahTombol);

        if (jumlahTombol >= 100) {
            System.out.println("Ukuran        : Full-size");
        } else {
            System.out.println("Ukuran        : Compact");
        }
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJumlahTombol(int jumlahTombol) {
        if (jumlahTombol > 0) {
            this.jumlahTombol = jumlahTombol;
        } else {
            System.out.println("Jumlah tombol harus lebih dari 0.");
        }
    }
}
