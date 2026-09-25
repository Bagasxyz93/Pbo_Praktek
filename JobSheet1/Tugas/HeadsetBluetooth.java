package Tugas;

public class HeadsetBluetooth {

    // Atribut
    private String merek;
    private int persentaseBaterai;

    // Method 1
    public void sambungkanBluetooth() {
        if (persentaseBaterai <= 0) {
            System.out.println(
                "Headset " + merek + " tidak dapat tersambung karena baterai habis."
            );
        } else {
            System.out.println(
                "Headset " + merek + " berhasil tersambung melalui Bluetooth."
            );
        }
    }

    // Method 2
    public void putarAudio(int durasi) {
        if (persentaseBaterai <= 0) {
            System.out.println("Audio tidak dapat diputar karena baterai habis.");
        } else if (durasi <= 0) {
            System.out.println("Durasi audio tidak valid.");
        } else {
            System.out.println(
                "Headset sedang memutar audio selama "
                + durasi + " menit."
            );

            if (durasi >= 60) {
                persentaseBaterai -= 20;
            } else {
                persentaseBaterai -= 10;
            }

            if (persentaseBaterai < 0) {
                persentaseBaterai = 0;
            }
        }
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFORMASI HEADSET BLUETOOTH ===");
        System.out.println("Merek          : " + merek);
        System.out.println("Baterai        : " + persentaseBaterai + "%");

        if (persentaseBaterai >= 70) {
            System.out.println("Status Baterai : Tinggi");
        } else if (persentaseBaterai >= 30) {
            System.out.println("Status Baterai : Sedang");
        } else if (persentaseBaterai > 0) {
            System.out.println("Status Baterai : Rendah");
        } else {
            System.out.println("Status Baterai : Habis");
        }
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setPersentaseBaterai(int persentaseBaterai) {
        if (persentaseBaterai >= 0 && persentaseBaterai <= 100) {
            this.persentaseBaterai = persentaseBaterai;
        } else {
            System.out.println(
                "Persentase baterai harus berada di antara 0 sampai 100."
            );
        }
    }
}
