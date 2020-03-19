import com.wangp.cap8.bean.Bird;
import com.wangp.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap8Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Bird bird = (Bird) applicationContext.getBean("bird");
        System.out.println(bird);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println("environment  ===== " + environment.getProperty("bird.color"));
    }
}
