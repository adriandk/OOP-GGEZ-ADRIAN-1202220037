public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisiSatu = new Ekspedisi(10, "Bandung", 15000);
        ekspedisiSatu.informasi();

        System.out.println("=====================");

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpressSatu = new FRIExpress(5, "Jakarta", 10000, false);
        friExpressSatu.informasi();
        friExpressSatu.terima(1000);
        friExpressSatu.kirim("Jakarta");
        friExpressSatu.kirim("Jakarta", "Bandung");

        System.out.println("=====================");

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpressSatu = new TelUExpress(2, "Semarang", 15000, true);
        telUExpressSatu.informasi();
        telUExpressSatu.ambil("Jakarta");
        telUExpressSatu.antar(112000);
        telUExpressSatu.antar(112055, 1200000);
    }
}
