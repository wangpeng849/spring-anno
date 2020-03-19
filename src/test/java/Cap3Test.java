import com.wangp.cap3.config.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap3Test {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        //从容器中分别取两次  是否为同一个bean
        Object bean1 = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean1 == bean2);//singleton：true   prototype: false
        //默认情况下 bean1 与 bean2 是同一个实例



    }
}
