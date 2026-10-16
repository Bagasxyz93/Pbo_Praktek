package UTS;

public class ReservasiReguler extends Reservasi {

    public ReservasiReguler(String kode, int jumlahMalam) {
        super(kode, jumlahMalam);
    }

    @Override
    public int hitungTotal(int tarif) {
        int totalDasar = super.hitungTotal(tarif);
        
        return (int) (totalDasar * 1.10);
    }

    @Override
    public int hitungTotal(int tarif, boolean extraBed) {
        int totalDasar = super.hitungTotal(tarif, extraBed);
        
        return (int) (totalDasar * 1.10);
    }

    @Override
    public String getJenis() {
        return "Reguler";
    }
}
