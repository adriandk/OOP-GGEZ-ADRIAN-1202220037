import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        Account accountOne = new Account("Adrian_SI4601", 1202220035, 500001.5);
        Account accountTwo = new Account("Adrian_SI4602", 1202220036, 500002.8);
        Account accountThree = new Account("Adrian_SI4603", 1202220037, 500003.1);

        bank.AddAccount(accountOne);
        bank.AddAccount(accountTwo);
        bank.AddAccount(accountThree);

        Account checkBalanceAccountOne = bank.GetAccount("Adrian_SI4601");
        Account checkBalanceAccountTwo = bank.GetAccount("Adrian_SI4602");
        Account checkBalanceAccountThree = bank.GetAccount("Adrian_SI4603");
        
        System.out.println("Saldo Akun " + checkBalanceAccountOne.getAccountName() + " : " + checkBalanceAccountOne.getAccountBalance());
        System.out.println("Saldo Akun " + checkBalanceAccountTwo.getAccountName() + " : " + checkBalanceAccountTwo.getAccountBalance());
        System.out.println("Saldo Akun " + checkBalanceAccountThree.getAccountName() + " : " + checkBalanceAccountThree.getAccountBalance());
    
        accountOne.deposit(10000);
        System.out.println("\nSaldo Akun " + checkBalanceAccountOne.getAccountName() + " setelah menyetor uang : Rp " +checkBalanceAccountOne.getAccountBalance());

        accountThree.withdraw(5000);
        System.out.println("Saldo Akun " + checkBalanceAccountThree.getAccountName() + " setelah menarik uang : Rp " +checkBalanceAccountThree.getAccountBalance());

        bank.RemoveAccount("Adrian_SI4602");
        System.out.println("\nAkun " + checkBalanceAccountTwo.getAccountName() + " Berhasil dihapus!\n");

        System.out.println("Daftar Semua Akun dalam Bank : \n");
        ArrayList<Account> listAccount = bank.GetAllAccount();
        for (Account account : listAccount){
            System.out.print("Nama : " + account.getAccountName() + ", ");
            System.out.print("Nomor Akun : " + account.getAccountNumber() + ", ");
            System.out.println("Saldo : " + account.getAccountBalance());
        }
    }
}
