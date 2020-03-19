import com.wangp.cap2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap2Test {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
