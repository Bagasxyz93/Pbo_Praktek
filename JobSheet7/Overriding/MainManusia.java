package JobSheet7.Overriding;

public class MainManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        // Pemanggilan method bernafas
        m1.bernafas();
        m2.bernafas();
        m3.bernafas();

        System.out.println("----------------------------------");

        // Pemanggilan method makan (Polymorphism / Dynamic Method Dispatch)
        m1.makan();
        m2.makan();
        m3.makan();
    }
}
