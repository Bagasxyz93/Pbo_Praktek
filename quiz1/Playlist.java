package quiz1;

public class Playlist {
    private String nama;
    private Lagu[] daftarLagu;

    public Playlist(String nama) {
        this.nama = nama;
    }

    public void setDaftarLagu(Lagu[] daftar) {
        this.daftarLagu = daftar;
    }

    public Lagu[] getDaftarLagu() {
        return daftarLagu;
    }

    public int totalDurasi() {
        int total = 0;
        if (daftarLagu != null) {
            for (Lagu lagu : daftarLagu) {
                if (lagu != null) {
                    total += lagu.getDurasi();
                }
            }
        }
        return total;
    }

    public void tampilkan() {
        System.out.println("Playlist: " + nama);
        if (daftarLagu != null) {
            for (Lagu lagu : daftarLagu) {
                if (lagu != null) {
                    System.out.println(lagu.info());
                }
            }
        }
        System.out.println("Total durasi: " + totalDurasi() + " detik");
    }
}
