package UTS;

public class MainVarian8 {
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("Hotel Tugu", 5);
        Manajer manajer = new Manajer("Ibu Ratna");
        hotel.setManajer(manajer);

        
        Tamu tamu1 = new Tamu("3501", "Bima");
        Tamu tamu2 = new Tamu("3502", "Citra");

        
        ReservasiReguler r1 = new ReservasiReguler("RSV-01", 2);
        r1.setTamu(tamu1);

        ReservasiMember r2 = new ReservasiMember("RSV-02", 3, "MBR-77");
        r2.setTamu(tamu2);

        
        hotel.checkin(r1);      
        hotel.checkin(r2, 1);   

        Resepsionis resepsionis = new Resepsionis("Ani");
        
        resepsionis.cetakinvoice(hotel.getKamar(3));
        resepsionis.cetakinvoice(hotel.getKamar(1));

        int totalExtraBed = r1.hitungTotal(500000, true);
        System.out.println("Total " + r1.getKode() + " dengan extra bed : " + totalExtraBed);
    }
}
