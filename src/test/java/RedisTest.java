import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    void test(){
        Jedis jedis=new Jedis("localhost");
        jedis.set("foo","ber");
        System.out.println(jedis.get("foo"));
        System.out.println(jedis.keys("*"));
    }
}
