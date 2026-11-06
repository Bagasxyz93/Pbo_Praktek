package JobSheet9.Percobaan.Coba2;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        // Mahasiswa mhsBiasa = new Mahasiswa("Charlie"); // Baris ini tidak bisa dikirim ke beriSertifikatCumlaude
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        Pascasarjana masterCumlaude = new Pascasarjana("Elok");

        // pakRektor.beriSertifikatCumlaude(mhsBiasa); // Error: Mahasiswa tidak implements ICumlaude
        
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampus();
    }
}