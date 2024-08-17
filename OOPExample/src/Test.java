public class Test {
    public static void main(String[] args) throws Exception {

        boolean adalahHewan;

        Hewan hewan = new Hewan(0, null, null, null);
        
        Burung burung = new Burung(2, "bertelur", "omnivora", "Burung");
        adalahHewan = burung instanceof Hewan;
        burung.printBurung(adalahHewan);

        Kucing kucing = new Kucing(4, "beranak", "omnivora", "Kucing");
        adalahHewan = kucing instanceof Hewan;
        kucing.printKucing(adalahHewan);

        Kucing kucingAnggora = new Kucing(4, "beranak", "omnivora", "Kucing", "Anggora");
        adalahHewan = kucingAnggora instanceof Hewan;
        kucingAnggora.printKucing(adalahHewan);

        Ikan ikan = new Ikan(0, "bertelur", "omnivora", "Ikan");
        adalahHewan = ikan instanceof Hewan;
        ikan.printIkan(adalahHewan);

        System.out.println("==========================================");
        System.out.println("==========================================");

        hewan.suara();
        System.out.println("==========================================");
        kucing.suara();
        System.out.println("==========================================");
        burung.suara();
        System.out.println("==========================================");
        ikan.suara();
    }
}
