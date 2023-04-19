import com.ex.proxy.AxeProxyCglib;
import com.ex.proxy.AxeProxyJdk;
import com.ex.tools.Axe;
import com.ex.tools.impl.StealAxe;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class AxeTest {
    @Test
    public void proxyJdkTest() {
        AxeProxyJdk axeProxyJdk = new AxeProxyJdk(new StealAxe());
        Axe axe = (Axe) axeProxyJdk.getProxy();
        axe.chop();
    }

    @Test
    public void proxyCGLIBTest() {
        StealAxe axe = new StealAxe();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(StealAxe.class);
        enhancer.setCallback(new AxeProxyCglib(axe));
        StealAxe stealAxe = (StealAxe) enhancer.create();
        stealAxe.chop();
    }
}
