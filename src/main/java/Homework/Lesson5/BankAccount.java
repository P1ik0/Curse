package Homework.Lesson5;

public class BankAccount {
    int id = 1;
    String name;
    double balance;

    void  popolnennieScheta(double summapopolneniya){
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополнения: "  + summapopolneniya);
        balance+=summapopolneniya;
        System.out.println("Баланс после пополнения: " + balance);

    }

    void  snytieSoSheta(int summasnytie){
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Баланс снятия: "  + summasnytie);
        balance-=summasnytie;
        System.out.println("Баланс после снятия: " + balance);

    }
    void showinfo()
    {
        System.out.println("ID: " + id + '\n' + "Name: " + name );

    }

    public static void main(String[] args) {
        BankAccount MyAccount  = new BankAccount();
        BankAccount YourAccount  = new BankAccount();
        BankAccount HisAccount  = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Alex";
        MyAccount.balance = 100;
        MyAccount.showinfo();
        MyAccount.popolnennieScheta(100);
        MyAccount.showinfo();
        MyAccount.snytieSoSheta(50);
        MyAccount.showinfo();


        YourAccount.id = 2;
        YourAccount.name = "Max";
        YourAccount.balance = 10.3;

        HisAccount.id = 3;
        HisAccount.name = "Sasha";
        HisAccount.balance = 3000;


    }
}
