import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {


    private Map<String, Account> accounts;
    private final Random random = new Random();

    public Bank(Map<String, Account> accounts) {
        this.accounts = accounts;
    }


    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
        throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public synchronized void transfer(String fromAccountNum, String toAccountNum, long amount){
        try {
            if (!accounts.get(fromAccountNum).isWorked() || !accounts.get(toAccountNum).isWorked()) {
                System.out.println("Аккаунты заблокированны");
                return;
            }
            else {
                if (fromAccountNum == accounts.get(fromAccountNum).getAccNumber()) {
                    if (amount < accounts.get(fromAccountNum).getMoney()) {
                        if (amount > 50000) {
                            if (isFraud(fromAccountNum, toAccountNum, amount))
                                DoTransaction(fromAccountNum, toAccountNum, amount);
                            else {
                                System.out.println("Не прошел проверку");
                                BlockAccount(fromAccountNum, toAccountNum);
                            }
                        } else
                            DoTransaction(fromAccountNum, toAccountNum, amount);
                    } else System.out.println("Не хватает денег на счете");
                } else System.out.println("Нет такого аккаунта");
            }
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    private synchronized void DoTransaction(String fromAccountNum, String toAccountNum, long amount){
        long i = accounts.get(fromAccountNum).getMoney();
        i -= amount;
        long j = accounts.get(toAccountNum).getMoney();
        j += amount;
        Account fromAccount = new Account(i, fromAccountNum, true);
        Account toAccount = new Account(j, toAccountNum, true);
        synchronized (fromAccount){
            synchronized (toAccount){
                accounts.put(fromAccountNum, fromAccount);
                accounts.put(toAccountNum, toAccount);
                System.out.println("Успешно произведена операция");
            }
        }

    }

    private void BlockAccount(String fromAccountNum, String toAccountNum){
        Account fromAccount = new Account(0, toAccountNum, false);
        Account toAccount = new Account(0, toAccountNum, false);
        accounts.put(fromAccountNum, fromAccount);
        accounts.put(toAccountNum, toAccount);
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        return accounts.get(accountNum).getMoney();
    }

    public long getSumAllAccounts() {
        long sum = 0;
        for (Account i : accounts.values()){
            sum += i.getMoney();
        }
        return sum;
    }
}
