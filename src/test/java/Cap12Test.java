import com.wangp.cap12.bean.SetValue2Test;
import com.wangp.cap12.config.Cap12MainConfig;
import com.wangp.cap12.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap12Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap12MainConfig.class);
//        OrderService bean = applicationContext.getBean(OrderService.class);
//        bean.addOrder();

        SetValue2Test testBean = applicationContext.getBean(SetValue2Test.class);
        testBean.helloWorld("world");
    }

}
