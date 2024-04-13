import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        DoThread(CreateAccount());

    }

    private static Map<String, Account> CreateAccount(){
        Account account1 = new Account(78000, "first", true);
        Account account2 = new Account(89000, "second", true);
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
        for (int i = 0; i< 100; i++) {
            Thread thread1 = new Thread(() -> {
                try {
                    bank.transfer("first", "second", 55000);
                    bank.transfer("second", "first", 55000);
                    System.out.println(bank.getBalance("first") + " Account name: first");
                    System.out.println(bank.getBalance("second") + " Account name: second");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    bank.transfer("third", "fourth", 40000);
                    bank.transfer("fourth", "third", 40000);
                    System.out.println(bank.getBalance("third") + " Account name: third");
                    System.out.println(bank.getBalance("fourth") + " Account name: fourth");
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
}
