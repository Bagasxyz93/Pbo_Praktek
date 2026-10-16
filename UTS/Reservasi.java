package UTS;

public abstract class Reservasi {
    protected String kode;
    protected int jumlahMalam;
    private Tamu tamu;

    public Reservasi(String kode, int jumlahMalam) {
        this.kode = kode;
        this.jumlahMalam = jumlahMalam;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public String getKode() {
        return kode;
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    
    public int hitungTotal(int tarif) {
        return tarif * jumlahMalam;
    }

    
    public int hitungTotal(int tarif, boolean extraBed) {
        int totalDasar = tarif * jumlahMalam;
        if (extraBed) {
            totalDasar += (150000 * jumlahMalam);
        }
        return totalDasar;
    }

    public abstract String getJenis();
}
