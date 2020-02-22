package AdminTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ADtest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void tese(){
        TAdmin tAdmin = new TAdmin();
        tAdmin.setUsername("2222");
        tAdmin.setEmail("555522");

        redisTemplate.opsForHash().put("cat:user","user2",tAdmin);
    }
    @Test
    public  void getReids(){
        List<TAdmin> values = redisTemplate.boundHashOps("cat:user").values();
        for(TAdmin tAdmin:values){
            System.out.println(tAdmin);
        }

    }


}
