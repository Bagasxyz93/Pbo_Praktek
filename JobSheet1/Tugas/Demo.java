package Tugas;

public class Demo {

    public static void main(String[] args) {
        Gitar gitar = new Gitar();

        gitar.setMerek("Yamaha");
        gitar.setJumlahSenar(6);

        System.out.println("=================================");
        System.out.println("           OBJECT GITAR");
        System.out.println("=================================");

        gitar.cetakInfo();
        gitar.stemGitar(3);
        gitar.mainkanGitar(15);


        Keyboard keyboard = new Keyboard();

        keyboard.setMerek("Fantech");
        keyboard.setJumlahTombol(104);

        System.out.println();
        System.out.println("=================================");
        System.out.println("         OBJECT KEYBOARD");
        System.out.println("=================================");

        keyboard.cetakInfo();
        keyboard.tekanTombol("Enter");
        keyboard.cekJumlahTombol();


        MouseWireless mouse = new MouseWireless();

        mouse.setMerek("Logitech");
        mouse.setDpi(800);

        System.out.println();
        System.out.println("=================================");
        System.out.println("       OBJECT MOUSE WIRELESS");
        System.out.println("=================================");

        mouse.cetakInfo();
        mouse.gerakkanMouse(150, 75);
        mouse.aturDPI(1600);


        HeadsetBluetooth headset = new HeadsetBluetooth();

        headset.setMerek("JBL");
        headset.setPersentaseBaterai(85);

        System.out.println();
        System.out.println("=================================");
        System.out.println("      OBJECT HEADSET BLUETOOTH");
        System.out.println("=================================");

        headset.cetakInfo();
        headset.sambungkanBluetooth();
        headset.putarAudio(30);

        System.out.println();
        System.out.println("Setelah digunakan:");
        headset.cetakInfo();
    }
}
