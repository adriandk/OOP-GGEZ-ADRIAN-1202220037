import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // TODO: Create Database Object
        Database database = new Database();

        // TODO: Create Konser Object and Set the Attributes
        Konser konserSatu = new Konser("Noah", "15-11-2023", "Sukabirus", 150000);
        Konser konserDua = new Konser("Sheila on 7", "16-11-2023", "Sukapura", 500000);

        // TODO: Insert Konser Object to Database
        database.addKonser(konserSatu);
        database.addKonser(konserDua);

        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("====================================");

        // TODO: Create a User Object and Set the Attributes
        User userSatu = new User();
        userSatu.setNama("Adrian_SI4603");
        userSatu.setNoHP("08515778888");
        userSatu.register();

        // TODO: Display Main Menu and Prompt User to Choose Menu
        System.out.println("====================================");
        int x = 2;
        for(int i = 0; i < x; i+=0){
            System.out.println("1. Lihat Konser");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Keluar");
            System.out.println("====================================");
            System.out.print("Silahkan Pilih Menu : ");
            int pilihan = scanner.nextInt();
            
            if(pilihan == 1){
                x = 2;
                database.showKonser();
            } else if(pilihan == 2){
                System.out.print("Pilih nomor konser : ");
                int nomorKonser = scanner.nextInt() - 1;
                System.out.print("Jumlah Tiket : ");
                int jumlahTiket = scanner.nextInt();
                database.buyTikect(nomorKonser, jumlahTiket);
                x = 2;
            } else if(pilihan == 3){
                System.out.println("Keluar");
                break;
            }
        }
    }
}
