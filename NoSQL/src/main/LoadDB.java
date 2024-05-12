import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisConnectionException;
import org.redisson.config.Config;
import org.redisson.api.RKeys;
import org.redisson.api.RScoredSortedSet;

import java.util.Date;

import static java.lang.System.out;

public class LoadDB {

    private RedissonClient redisson;
    private RKeys rKeys;
    private RScoredSortedSet<String> onlineUsers;
    private final static String KEY = "ONLINE_USERS";

    public void doConnectDB(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        try {
            redisson = Redisson.create(config);
        } catch (RedisConnectionException Exc) {
            out.println("Не удалось подключиться к Redis");
            out.println(Exc.getMessage());
        }
        rKeys = redisson.getKeys();
        onlineUsers = redisson.getScoredSortedSet(KEY);
        rKeys.delete(KEY);
    }

    public String getLastOnlineUsers(){
        return  onlineUsers.last();
    }
    private double getTs() {
        return (double) new Date().getTime() / 1000;
    }
    void logPageVisit(int user_id)
    {
        onlineUsers.add(getTs(), String.valueOf(user_id));
    }
    public RedissonClient getRedisson(){
        return redisson;
    }

    void shutdown() {
        redisson.shutdown();
    }
}
