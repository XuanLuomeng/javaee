import com.tools.impl.ArithmeticAdd;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArithmeticAddTest {
    @Test
    public void springTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        ArithmeticAdd arithmeticAdd = (ArithmeticAdd) ioc.getBean("arithmetic");
        double calc = arithmeticAdd.calc(1, 6);
        System.out.println(calc);
    }
}
