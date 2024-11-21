import java.util.Scanner;

public class App {

    public static void main(String[] args){

        // Scanner scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        // // TODO: Display Greeting Message and Prompt User to Register
        // System.out.println("Selamat Datang di Konser EAD");
        // System.out.println("Silahkan Register Terlebih Dahulu");
        // System.out.println("====================================");

        // // TODO: Create a User Object and Set the Attributes
        // User userSatu = new User();
        // userSatu.setNama("Adrian_SI4603");
        // userSatu.setNoHP("08515778888");
        // userSatu.register();

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

            // pilihan valuenya = 1
            
            if(pilihan == 1){
                // database.showKonser();
                System.out.println("Pilihan 1");
            } else if(pilihan == 2){
                System.out.println("Pilihan 1");
                // System.out.print("Pilih nomor konser : ");
                // int nomorKonser = scanner.nextInt() - 1;
                // System.out.print("Jumlah Tiket : ");
                // int jumlahTiket = scanner.nextInt();
                // database.buyTikect(nomorKonser, jumlahTiket);
            } else if(pilihan == 3){
                System.out.println("Keluar");
                break;
            }
        }
        scanner.close();
    }
}
