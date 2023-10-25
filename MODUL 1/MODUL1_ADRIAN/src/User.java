public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String nama, noHP;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(){
        System.out.println("Nama : " + nama);
        System.out.println("No HP : " + noHP);
        System.out.println("====================================");
        System.out.println("Register Berhasil !");
        System.out.println("Nama : " + nama);
        System.out.println("No HP : " + noHP);
    }

}
