package quiz1;

public class Lagu {
    private String judul;
    private String penyanyi;
    private int durasi;

    public Lagu() {

    }

    public Lagu(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String info() {
        int menit = durasi / 60;
        int detik = durasi % 60;
        String waktu = String.format("%d:%02d", menit, detik);
        return judul + " - " + penyanyi + " (" + waktu + ")";
    }
}



