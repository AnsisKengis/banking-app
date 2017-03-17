package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        Scanner menuReader = new Scanner(System.in);
        System.out.println("Please choose number: \n (1) Sign up \n (2) Login \n (3) Quit");
        int menu = menuReader.nextInt();
        List<User> users = new ArrayList<User>();
            if (menu == 1) {
                User newUser = new User();
                users.add(newUser);

                System.out.println("Hello, sign up here ");
                Scanner userReader = new Scanner(System.in);
                System.out.println("Enter your email here: ");
                String newEmail = userReader.next();
                newUser.newEmail(newEmail);
                System.out.println("Your email address is: " + newUser.getEmail());

                Scanner passwordReader = new Scanner(System.in);
                System.out.println("Enter your password here: ");
                String newPassword = passwordReader.next();
                newUser.newPassword(newPassword);
                System.out.println("Your password is: " + newUser.getPassword());
                System.out.println("You have successfully registered");
                System.out.println("Your current balance is: " + newUser.getBalance());


                Scanner depositWithdrawReader = new Scanner(System.in);
                System.out.println("Please choose number: \n (1) Deposit money \n (2) Withdraw money \n (3) Logout");
                int depositWithdrawMenu = depositWithdrawReader.nextInt();

                if (depositWithdrawMenu == 1) {
                    Scanner depositReader = new Scanner(System.in);
                    System.out.println("Enter deposit ammount here: ");
                    int deposit = depositReader.nextInt();
                    newUser.deposit(deposit);
                    System.out.println("Your current balance is: " + newUser.getBalance());

                }
                if (depositWithdrawMenu == 2) {
                    Scanner withdrawReader = new Scanner(System.in);
                    System.out.println("Enter withdraw ammount here: ");
                    int withdraw = withdrawReader.nextInt();
                    newUser.withdraw(withdraw);
                    System.out.println("Your current balance is: " + newUser.getBalance());

                }
//                if (depositWithdrawMenu == 3) {
//                    newUser.end();
//                }
            }
//            if (menu == 2) {
//                User newUser = new User();
//                users.add(newUser);
//
//                Scanner loginValidation = new Scanner(System.in);
//                System.out.println("Enter your email here: ");
//                String loginEmail = loginValidation.nextLine();
//                System.out.println("Enter your password here: ");
//                String loginPassword = loginValidation.nextLine();
//                newUser.login(loginEmail, loginPassword);
//            }
            if (menu == 3) {
                System.exit(0);
            }
    }
}
