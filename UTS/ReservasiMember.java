package UTS;

public class ReservasiMember extends Reservasi {
    private String noMember;

    public ReservasiMember(String kode, int jumlahMalam, String noMember) {
        super(kode, jumlahMalam);
        this.noMember = noMember;
    }

    @Override
    public int hitungTotal(int tarif) {
        int totalDasar = super.hitungTotal(tarif);
        
        return (int) (totalDasar * 0.85);
    }

    @Override
    public String getJenis() {
        return "Member";
    }

    public String getNoMember() {
        return noMember;
    }
}
