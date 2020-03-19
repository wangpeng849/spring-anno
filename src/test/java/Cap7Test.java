import com.wangp.cap7.config.Cap7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap7Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
        System.out.println("IOC容器创建完成");
        applicationContext.close();


        //Jeep constructor....          ---------> Bean的构造方法
        //postProcessBeforeInitialization
        //Jeep PostConstruct            ---------> PostConstruct注解
        //Jeep afterPropertiesSet ...   ---------> afterPropertiesSet接口
        //Jeep init ....                ---------> @Bean的init参数
        //postProcessAfterInitialization
        //IOC容器创建完成
        //Jeep PreDestroy               ---------> PreDestroy注解
        //Jeep DisposableBean ...       ---------> DisposableBean接口
        //Jeep destroy ..               ---------> @Bean的destroy参数


    }
}
