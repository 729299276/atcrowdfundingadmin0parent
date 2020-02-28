package AdminTest;

import com.atguigu.crowd.funding.AppTest;
import com.atguigu.crowd.funding.entity.TAdmin;
import com.atguigu.crowd.funding.entity.TRole;
import com.atguigu.crowd.funding.mapper.TAdminMapper;
import com.thoughtworks.xstream.XStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppTest.class)
public class ADtest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private TAdminMapper tAdminMapper;

    @Test
    public void tese() {
        TAdmin roleByName = tAdminMapper.getRoleByName(1);
        System.out.println(roleByName);

    }
    //
    @Test
    public  void testxml(){
        XStream xStream = new XStream();
        TAdmin tAdmin = tAdminMapper.getRoleByName(1);
        xStream.alias("admin",TAdmin.class);
        xStream.alias("role", TRole.class);
        String xml = xStream.toXML(tAdmin);
        System.out.println(xml);
    }
    @Test
    public void xmltobean(){
        XStream xStream = new XStream();
        String str = "<admin>\n" +
                "  <id>1</id>\n" +
                "  <loginacct>admin001</loginacct>\n" +
                "  <userpswd>4297F44B13955235245B2497399D7A93</userpswd>\n" +
                "  <username>ADMIN003</username>\n" +
                "  <email>admin003@qq.com</email>\n" +
                "  <roles>\n" +
                "    <role>\n" +
                "      <id>1</id>\n" +
                "      <name>PM - 项目经理</name>\n" +
                "    </role>\n" +
                "    <role>\n" +
                "      <id>2</id>\n" +
                "      <name>SE - 软件工程师</name>\n" +
                "    </role>\n" +
                "    <role>\n" +
                "      <id>3</id>\n" +
                "      <name>PG - 程序员</name>\n" +
                "    </role>\n" +
                "  </roles>\n" +
                "</admin>";
        xStream.alias("admin",TAdmin.class);
        xStream.alias("role", TRole.class);
        TAdmin o =(TAdmin) xStream.fromXML(str);
        System.out.println(o);
    }
}