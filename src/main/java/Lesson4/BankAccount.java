package Lesson4;

public class BankAccount {
    int id = 1;
    String name;
    double balance;


    void showinfo()
    {
        System.out.println("ID: " + id + '\n' + "Name: " + name + '\n' + "Balance: " + balance);

    }

    public static void main(String[] args) {
        BankAccount MyAccount  = new BankAccount();
        BankAccount YourAccount  = new BankAccount();
        BankAccount HisAccount  = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Alex";
        MyAccount.balance = 100;
        MyAccount.showinfo();


        YourAccount.id = 2;
        YourAccount.name = "Max";
        YourAccount.balance = 10.3;

        HisAccount.id = 3;
        HisAccount.name = "Saha";
        HisAccount.balance = 3000;


    }
}
