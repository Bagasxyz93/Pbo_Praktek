package UTS;

public class Hotel {
    private String nama;
    private Kamar[] daftarKamar;
    private Manajer manajer;

    
    public Hotel(String nama, int jumlahKamar) {
        this.nama = nama;
        this.daftarKamar = new Kamar[jumlahKamar];
        
        for (int i = 0; i < jumlahKamar; i++) {
            int nomorKamar = i + 1;
            String tipe;
            int tarif;
            
            
            if (nomorKamar <= 2) {
                tipe = "Deluxe";
                tarif = 750000;
            } else {
                tipe = "Standard";
                tarif = 500000;
            }
            daftarKamar[i] = new Kamar(nomorKamar, tipe, tarif);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    
    public void checkin(Reservasi r) {
        for (Kamar k : daftarKamar) {
            if (k.getTipe().equalsIgnoreCase("Standard") && k.isKosong()) {
                k.isi(r);
                break;
            }
        }
    }

    
    public void checkin(Reservasi r, int nomorKamar) {
        for (Kamar k : daftarKamar) {
            if (k.getNomor() == nomorKamar) {
                k.isi(r);
                break;
            }
        }
    }

    public Kamar getKamar(int nomor) {
        for (Kamar k : daftarKamar) {
            if (k.getNomor() == nomor) {
                return k;
            }
        }
        return null;
    }

    public void tampilInfo() {
        System.out.println("Hotel: " + nama);
        if (manajer != null) {
            System.out.println("Manajer: " + manajer.getNama());
        }
    }
}
