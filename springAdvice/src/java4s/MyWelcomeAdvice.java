package java4s;
 
import java.lang.reflect.Method;
 
public class MyWelcomeAdvice implements org.springframework.aop.MethodBeforeAdvice{
 
    public void before(Method m, Object args[], Object target)throws Exception
    {
        System.out.println("Am from BeforeAdvice to "+m.getName());
    }
 
}