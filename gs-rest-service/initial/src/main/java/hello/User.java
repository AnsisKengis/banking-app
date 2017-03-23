//package hello;
//
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.util.Scanner;
//
//public class User {
//    private int balance;
//    private static User user;
//    public User() {
//        balance = 0;
//    }
//
//    @NotNull
//    private String email;
//
//    @NotNull
//    @Size(min = 5, max = 18)
//    private String password;
//
//    public void newEmail(String email) {
//        this.email = email;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void newPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void newBalance(int balance) {
//        this.balance = balance;
//    }
//    public int getBalance()
//    {
//        return balance;
//    }
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public synchronized void deposit(int amount) {
//        balance = balance + amount;
//    }
//
//    public synchronized void withdraw(int amount) {
//        try{
//            if (balance >= amount) {
//                balance = balance - amount;
//                System.out.println(getEmail() + " just withdraw " + amount);
//            }
//            else {
//                System.out.println("Unfortunately, " + getEmail() + ", you don't have enough money ");
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void end() {
//        System.exit(0);
//    }
//
//    public void login(String email, String password) {
//        try {
//            if (email == getEmail() && password == getPassword()) {
//                System.out.println("Hello" + getEmail() + ", you have successfully logged in");
//
//            }
//            else System.out.println("This works , " + getEmail() + ", you cant login");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return email;
//    }
//}
