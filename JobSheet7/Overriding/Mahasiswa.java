package JobSheet7.Overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur di perpustakaan.");
    }
}