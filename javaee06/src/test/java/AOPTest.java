import com.ex.tools.impl.SteelAxe;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void ToolUpkeepTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config/beans.xml");
        SteelAxe axe = applicationContext.getBean(SteelAxe.class);
        axe.chop();
    }

    @Test
    public void ToolUpkeepTestTwo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config/beans.xml");
        SteelAxe axe = applicationContext.getBean(SteelAxe.class);
        axe.chop();
    }
}
