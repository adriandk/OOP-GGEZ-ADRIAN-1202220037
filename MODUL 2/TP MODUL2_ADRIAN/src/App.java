public class App {
    public static void main(String[] args) throws Exception {
        
        Bus busSatu = new Bus("BUS1", 120, 50, 2);
        Mobil mobilSatu = new Mobil("MOB1", 200, 4, 4);

        System.out.println("Informasi Bus : ");
        System.out.println(busSatu.toString());
        System.out.println("Waktu tempuh dengan bus " + busSatu.nomorIdentifikasi + " : " + busSatu.hitungWaktuTempuh(48) + "\n");

        System.out.println("Informasi Mobil : ");
        System.out.println(mobilSatu.toString());
        System.out.println("Waktu tempuh dengan mobil " + mobilSatu.nomorIdentifikasi + " : " + mobilSatu.hitungWaktuTempuh(50));
    }
}
