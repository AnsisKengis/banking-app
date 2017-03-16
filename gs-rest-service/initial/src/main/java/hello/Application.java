package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        User UserAnsis = new User();

        System.out.println("Hello, sign up here ");
        Scanner userReader = new Scanner(System.in);
        System.out.println("Enter your email here: ");
        String newUser = userReader.next();
        UserAnsis.newEmail(newUser);
        System.out.println("Your email address is: " + UserAnsis.getEmail());

        Scanner passwordReader = new Scanner(System.in);
        System.out.println("Enter your password here: ");
        String newPassword = passwordReader.next();
        UserAnsis.newPassword(newPassword);
        System.out.println("Your password is: " + UserAnsis.getPassword());

        System.out.println("Your current balance is: " + UserAnsis.getBalance());

            Scanner depositReader = new Scanner(System.in);
            System.out.println("Enter deposit ammount here: ");
            int deposit = depositReader.nextInt();
            UserAnsis.deposit(deposit);
            System.out.println("Your current balance is: " + UserAnsis.getBalance());


        Scanner withdrawReader = new Scanner(System.in);
        System.out.println("Enter withdraw ammount here: ");
        int withdraw = withdrawReader.nextInt();
        UserAnsis.withdraw(withdraw);
        System.out.println("Your current balance is: " + UserAnsis.getBalance());

        System.out.println(UserAnsis.getBalance());
    }
}
