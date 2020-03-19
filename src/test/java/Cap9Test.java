import com.wangp.cap8.config.Cap8MainConfig;
import com.wangp.cap9.bean.Moon;
import com.wangp.cap9.bean.Sun;
import com.wangp.cap9.config.Cap9MainConfig;
import com.wangp.cap9.dao.TestDao;
import com.wangp.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.awt.ModalExclude;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap9Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
        TestService service = applicationContext.getBean(TestService.class);
        service.print();

        TestDao testDao  = applicationContext.getBean(TestDao.class);
        System.out.println(testDao);

    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
        Moon moon = applicationContext.getBean(Moon.class);
        System.out.println(moon);
        Sun sun = applicationContext.getBean(Sun.class);
        System.out.println(sun.getMoon());
    }
}
