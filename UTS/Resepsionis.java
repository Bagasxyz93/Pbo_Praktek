package UTS;

public class Resepsionis {
    private String nama;

    public Resepsionis(String nama) {
        this.nama = nama;
    }

    
    public void cetakinvoice(Kamar kamar) {
        if (kamar != null && !kamar.isKosong()) {
            Reservasi r = kamar.getReservasi();
            int totalBiaya = r.hitungTotal(kamar.getTarif());
            
            System.out.println("Invoice Kamar " + kamar.getNomor() + " (" + kamar.getTipe() + ") - " + 
                               r.getKode() + " " + r.getTamu().getNama() + " [" + r.getJenis() + "] " + 
                               r.getJumlahMalam() + " malam : " + totalBiaya);
        }
    }
}