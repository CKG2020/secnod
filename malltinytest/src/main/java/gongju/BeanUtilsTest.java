package gongju;



import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;


import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtilsTest {
    @Test
    public void testBeanUtils() throws InvocationTargetException, IllegalAccessException {
        BeanUtils beanUtils = new BeanUtils();
        User user = new User();
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id","88");
        objectObjectHashMap.put("username","kk");
        objectObjectHashMap.put("password","**************");
        try {
            beanUtils.setProperty(user,"id","20");
            try {
                System.out.println(beanUtils.getProperty(user,"id"));
                beanUtils.populate(user,objectObjectHashMap);
                System.out.println(user);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
