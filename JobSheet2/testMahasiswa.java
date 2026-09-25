package JobSheet2;

public class testMahasiswa {
   public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "254107020032";
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "TI-1A";

        System.out.println("=================================");
        System.out.println("         BIODATA MAHASISWA");
        System.out.println("=================================");

        mhs1.tampilBiodata();
    }

}
