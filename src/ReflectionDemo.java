import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.*;
public class ReflectionDemo {
    public static void main(String[] args)throws Exception {
        ReflectionClass reflectionDemo=new ReflectionClass();

        Class cls=reflectionDemo.getClass();
        System.out.println(cls.getName());

        Constructor constructor=cls.getConstructor();
        System.out.println(constructor.getName());

        Method[] methods=cls.getMethods();

        for(Method m:methods){
            System.out.println(m.getName());
        }

        Method method=cls.getDeclaredMethod("display");
        method.setAccessible(true);

        System.out.println(method.getName());

    }
}
