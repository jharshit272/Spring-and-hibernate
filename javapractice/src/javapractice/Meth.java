package javapractice;
import java.lang.reflect.Method;  
import javapractice.A;

public class Meth{  
public static void main(String args[])throws Exception{  
Class c=A.class;  
Object obj=c.newInstance();  
  
Method m=c.getDeclaredMethod("message",null);  
m.setAccessible(true);  
m.invoke(obj,null);  
}}  