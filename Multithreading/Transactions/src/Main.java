import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        DoThread(CreateAccount());

    }

    private static Map<String, Account> CreateAccount(){
        Account account1 = new Account(78000, "first", true);
        Account account2 = new Account(1, "second", true);
        Account account3 = new Account(653321, "third", true);
        Account account4 = new Account(2342215, "fourth", true);


        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("first", account1);
        accountMap.put("second", account2);
        accountMap.put("third", account3);
        accountMap.put("fourth", account4);

        return accountMap;
    }

    private static void DoThread(Map<String, Account> accountMap) throws InterruptedException {
        Bank bank = new Bank(accountMap);

        Thread thread1 = new Thread(() -> {
            try {
                bank.transfer("first", "second",40000);
                System.out.println(bank.getBalance("first"));
                System.out.println(bank.getBalance("second"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bank.transfer("second", "first",30000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
