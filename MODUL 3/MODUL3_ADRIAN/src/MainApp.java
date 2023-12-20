import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scan = new Scanner(System.in);
        ArrayList<String> bookedSeat = new ArrayList<String>();

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User userSatu = new User();

        System.out.println("Silahkan Register");
        System.out.println("===============");
        userSatu.register();

        // TO DO : Take the name from the user, make sure it is not empty
        String namaUser = userSatu.getName();
        System.out.println("Nama : " + namaUser);

        // TO DO : Take the phone number from the user, make sure it is valid
        String nohp = userSatu.getnoHandPhone();
        System.out.println("Nama : " + nohp);


        System.out.println("Selamat Datang di BIOSKOP EAD");
        System.out.println("Booking Tiket Bioskop : ");

        bioskop.displaySeating();

        // TO DO : Create a code for ticket order

        while (true) {
            int baris;
            int posisi;
            System.out.print("Apakah anda ingin memesan kursi? (Y/N) : ");
            String pesan = scan.nextLine();
            System.out.println();
            if (pesan.equals("y") || pesan.equals("y")) {
                try {
                    System.out.print("Pilih baris kursi : ");
                    baris = scan.nextInt();
                    System.out.println();

                    System.out.print("Pilih posisi kursi : ");
                    posisi = scan.nextInt();
                    System.out.println();

                    bioskop.bookSeat(baris, posisi);
                    boolean bookStat = bioskop.bookedStatus();
                    if (bookStat) {
                        cashier.seatNumber(baris + ", " + posisi);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Harus angka!");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Input harus berada dirange seat");
                }
            } else {
                cashier.printTicket(namaUser, nohp);
                break;
            }
            scan.nextLine();
        }
        scan.close();
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished
    }
}
