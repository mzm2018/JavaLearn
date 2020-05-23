package Constrctors;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setCustomerName("Mohammed Zuhair");
        account.setEmail("mohammed.zuhair@gmail.com");
        account.setBalance(9000);
        account.setPhoneNumber("0870998206");
        System.out.println("accont= " + account.getAccountNumber());
        System.out.println("balance= " + account.getBalance());
        System.out.println("deposit= 698");
        account.depositFunds(698);
        System.out.println("balance= " + account.getBalance());
        System.out.println("withdraw= 5876");
        account.withdrawFunds(5876);
        System.out.println("balance= " + account.getBalance());
        System.out.println("withdraw= 5876");
        System.out.println("balance= " + account.getBalance());




    }

}
