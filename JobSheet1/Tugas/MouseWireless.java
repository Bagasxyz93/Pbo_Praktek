package Tugas;

public class MouseWireless {

    // Atribut
    private String merek;
    private int dpi;

    // Method 1
    public void gerakkanMouse(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Mouse tidak bergerak.");
        } else {
            System.out.println(
                "Mouse " + merek + " bergerak "
                + "ke posisi (" + x + ", " + y + ")."
            );
        }
    }

    // Method 2
    public void aturDPI(int dpiBaru) {
        if (dpiBaru < 400) {
            System.out.println("DPI terlalu rendah.");
        } else if (dpiBaru > 3200) {
            System.out.println("DPI terlalu tinggi.");
        } else {
            dpi = dpiBaru;
            System.out.println(
                "DPI mouse berhasil diatur menjadi " + dpi + "."
            );
        }
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI MOUSE WIRELESS ===");
        System.out.println("Merek : " + merek);
        System.out.println("DPI   : " + dpi);

        if (dpi <= 800) {
            System.out.println("Sensitivitas : Rendah");
        } else if (dpi <= 1600) {
            System.out.println("Sensitivitas : Sedang");
        } else {
            System.out.println("Sensitivitas : Tinggi");
        }
    }

    // Setter
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setDpi(int dpi) {
        if (dpi > 0) {
            this.dpi = dpi;
        } else {
            System.out.println("DPI harus lebih dari 0.");
        }
    }
}
