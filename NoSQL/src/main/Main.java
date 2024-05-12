import java.util.Random;

public class Main {
    private static final int USERS = 20;
    private static double eventProbability = 0.1;

    public static void main(String[] args) throws InterruptedException {
        LoadDB loadDB = new LoadDB();
        loadDB.doConnectDB();
        Random random = new Random();

        for (int i = 1; i <= USERS; i ++){
            double randomNumber = random.nextDouble();
            if (randomNumber <  eventProbability){
                int randomId = random.nextInt(USERS - 1 + 1) + 1;
                loadDB.logPageVisit(randomId);
                String lastUser = loadDB.getLastOnlineUsers();
                System.out.println("Пользователь оплатил " + lastUser);
                LastUser(lastUser);
            }
            else {
                loadDB.logPageVisit(i);
                String lastUser = loadDB.getLastOnlineUsers();
                LastUser(lastUser);
            }
            if (i == 20) i = 0;
            Thread.sleep(350);
        }
    }

    private static  void LastUser(String user){
        System.out.println("Show User " + user);

    }
}
