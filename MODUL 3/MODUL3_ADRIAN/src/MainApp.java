import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scan = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User userSatu = new User();

        System.out.println("Silahkan Register");
        System.out.println("===============");
        userSatu.register();

        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("Nama : " + userSatu.getName());

        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.println("Nama : " + userSatu.getnoHandPhone());
        System.out.println("Selamat Datang di BIOSKOP EAD");
        System.out.println("Booking Tiket Bioskop : ");

        bioskop.displaySeating();

        // TO DO : Create a code for ticket order
        System.out.println("Apakah anda ingin memesan kursi? : (1/0)");
        String pesan = scan.next();
        if (pesan == "y") {
            System.out.println("Pilih baris kursi : ");
            int baris = scan.nextInt();
            System.out.println("Pilih posisi kursi : ");
            int posisi = scan.nextInt();
            bioskop.bookSeat(baris, posisi);
        } else {
            
        }
        

        
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished   
    }
}