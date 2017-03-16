package hello;


public class Account {
    public static Account account;
    private static int balance = 1000;
    private static User user;

    private Account() {
    }

    public static Account getAccount(User p) {
        if (account == null) {
            account = new Account();
        }
        Account.user = p;
        return account;
    }

    public static int getBal() {
        return balance;
    }

    public synchronized void withdraw(int bal) {
//        try {
//
//            if (balance >= bal) {
//                System.out.println(user.getEmail() + " " + "is try to withdraw");
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                balance = balance - bal;
//                System.out.println(user.getEmail() + " " + "is complete the withdraw");
//            } else {
//                System.out.println(user.getEmail() + " " + "doesn't have enough money for withdraw ");
//            }
//            System.out.println(user.getEmail() + " " + " withdraw Rs." + balance);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    public synchronized void deposit(int bal) {
        try {
            if (bal > 0) {
                System.out.println(user.getEmail() + " " + " is try to deposit");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                balance = balance + bal;
                System.out.println(user.getEmail() + " " + "is complete the deposit");
            } else {
                System.out.println(user.getEmail() + " " + "doesn't have enough money for deposit");
            }
            System.out.println(user.getEmail() + " " + " deposit Rs." + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
