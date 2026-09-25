package Tugas;

public class Gitar {

    private String merek;
    private int jumlahSenar;

    public void stemGitar(int nomorSenar) {
        if (nomorSenar >= 1 && nomorSenar <= jumlahSenar) {
            System.out.println(
                "Senar ke-" + nomorSenar + " sedang disetem."
            );
        } else {
            System.out.println(
                "Nomor senar tidak valid. Gitar memiliki "
                + jumlahSenar + " senar."
            );
        }
    }

    public void mainkanGitar(int durasi) {
        if (durasi <= 0) {
            System.out.println("Durasi bermain tidak valid.");
        } else if (durasi <= 10) {
            System.out.println(
                "Gitar " + merek + " dimainkan selama "
                + durasi + " menit."
            );
        } else {
            System.out.println(
                "Gitar " + merek + " dimainkan cukup lama, yaitu "
                + durasi + " menit."
            );
        }
    }

    public void cetakInfo() {
        System.out.println("=== INFORMASI GITAR ===");
        System.out.println("Merek        : " + merek);
        System.out.println("Jumlah Senar : " + jumlahSenar);

        if (jumlahSenar == 6) {
            System.out.println("Jenis        : Gitar 6 senar");
        } else {
            System.out.println(
                "Jenis        : Gitar dengan "
                + jumlahSenar + " senar"
            );
        }
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJumlahSenar(int jumlahSenar) {
        if (jumlahSenar > 0) {
            this.jumlahSenar = jumlahSenar;
        } else {
            System.out.println("Jumlah senar harus lebih dari 0.");
        }
    }
}
