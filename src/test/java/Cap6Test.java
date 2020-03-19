import com.wangp.cap5.config.Cap5MainConfig;
import com.wangp.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap6Test {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        System.out.println("IOC容器创建完成");


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //cap6MainConfig
            //com.wangp.cap6.bean.Dog    bean名称为全称
            //person
            System.out.println(beanDefinitionName);
        }

//        Object dog = applicationContext.getBean("com.wangp.cap6.bean.Dog");
//        System.out.println(dog);

        Object wangpFactoryBean = applicationContext.getBean("&wangpFactoryBean");
        System.out.println("bean类型="+wangpFactoryBean.getClass());
    }
}
