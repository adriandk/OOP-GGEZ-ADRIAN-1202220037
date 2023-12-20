import java.util.Scanner;

public class User {
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String nama, noHandPhone;
   
   public User() {}
   public void setName(String nama) {
      this.nama = nama;
   }
   public void setNoHandPhone(String phoneNumber) {
      this.noHandPhone = phoneNumber;
   }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Masukan Nama : ");
      String nama = scan.nextLine();
      System.out.println("Masukan no hp : ");
      String nohp = scan.nextLine();
      setName(nama);
      setNoHandPhone(nohp);
      System.out.println("Register berhasil");
   }
   // TO DO: Create method to return name and phone number
   public String getName() {
      return this.nama;
   }

   public String getnoHandPhone() {
      return this.noHandPhone;
   }
}