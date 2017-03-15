package hello;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExercice extends Thread implements Runnable {
    private User user;

    public ThreadExercice(User p) {
        this.user = p;
    }

    public static void main(String[] args) {

        ThreadExercice ts1 = new ThreadExercice(new User());
        ts1.start();
        ThreadExercice ts2 = new ThreadExercice(new User());
        ts2.start();
        ThreadExercice ts3 = new ThreadExercice(new User());
        ts3.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Account acc = Account.getAccount(user);
                acc.withdraw(100);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadExercice.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (acc.getBal() < 0) {
                    System.out.println("account is overdrawn!");
                }
                acc.deposit(200);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final Acc balance is Rs." + Account.getBal());
    }
}
