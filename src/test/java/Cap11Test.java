import com.wangp.cap11.aop.Calculator;
import com.wangp.cap11.config.Cap11MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Cap11Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap11MainConfig.class);
        Calculator calculator = applicationContext.getBean(Calculator.class);
        int div = calculator.div(3, 6);
        System.out.println(div);
    }

}
