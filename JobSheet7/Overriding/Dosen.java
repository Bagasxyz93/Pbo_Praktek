package JobSheet7.Overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas.");
    }
}