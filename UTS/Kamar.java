package UTS;

public class Kamar {
    private int nomor;
    private String tipe;
    private int tarif;
    private Reservasi reservasi;

    public Kamar(int nomor, String tipe, int tarif) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.tarif = tarif;
        this.reservasi = null;
    }

    public void isi(Reservasi reservasi) {
        this.reservasi = reservasi;
    }

    public Reservasi getReservasi() {
        return reservasi;
    }

    public boolean isKosong() {
        return this.reservasi == null;
    }

    public int getNomor() {
        return nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTarif() {
        return tarif;
    }
}
