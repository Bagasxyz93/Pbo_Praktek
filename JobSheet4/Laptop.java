package JobSheet4;

public class Laptop {
    private String merk;
    private String proc;

    public Laptop() {
    }

    public Laptop(String merk, String proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getProc() {
        return proc;
    }

    
}
