import org.joyful4j.framework.utils.ClassUtil;

import java.net.URL;
import java.util.Set;

/**
 * Created by richey on 16-9-15.
 */
public class Test {

    @org.junit.Test
    public void testResource(){
        Set<Class<?>> classes = ClassUtil.getClassSet("org.joyful4j.demo");
        System.out.println(classes);
    }
}
