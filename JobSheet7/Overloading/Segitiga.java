public class Segitiga {
    private int sudut;

    // Method overloading 1: Menghitung sisa sudut dengan 1 sudut diketahui
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Method overloading 1: Menghitung sisa sudut dengan 2 sudut diketahui
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Method overloading 2: Menghitung keliling segitiga dengan 3 sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method overloading 2: Menghitung c = sqrt(a^2 + b^2)
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}