import com.wangp.cap10.config.Cap10MainConfig;
import com.wangp.cap9.bean.Moon;
import com.wangp.cap9.bean.Sun;
import com.wangp.cap9.config.Cap9MainConfig;
import com.wangp.cap9.dao.TestDao;
import com.wangp.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap10Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
    }

}
