package quiz1;

public class MainSoalA6 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Favorite Songs");

        Lagu lagu1 = new Lagu("Michelle", "The Beatles", 210);
        Lagu lagu2 = new Lagu("Blackbird", "The Beatles", 180);
        Lagu lagu3 = new Lagu("Hotel California", "Eagles", 240);

        Lagu[] daftarLagu = {lagu1, lagu2, lagu3};
        playlist.setDaftarLagu(daftarLagu);

        playlist.tampilkan();
    }
}
