package hello;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private double balance;
    private static User user;
    public User() {
        balance = 0;
    }
    public User(double initialBalance)
    {
        balance = initialBalance;
    }

    @NotNull
    private String email;

    @NotNull
    @Size(min = 5, max = 18)
    private String password;

    public void newEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void newPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



    public synchronized void deposit(double amount) {
                balance = balance + amount;
    }

    public synchronized void withdraw(double amount) {
//        try {
//
//            if (balance >= amount) {
//                System.out.println(user.getEmail() + " " + "is try to withdraw");
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                balance = balance - amount;
//                System.out.println(user.getEmail() + " " + "is complete the withdraw");
//            } else {
//                System.out.println(user.getEmail() + " " + "doesn't have enough money for withdraw ");
//            }
//            System.out.println(user.getEmail() + " " + " withdraw Rs." + balance);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


    public void newBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return email;
    }
}
