import com.wangp.cap4.config.Cap4MainConfig;
import com.wangp.cap5.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap5Test {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
        System.out.println("IOC容器创建完成");


    }
}
