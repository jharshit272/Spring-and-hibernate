package java4s;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class ClientLogic {
 
	public static void main(String[] args)
	{
		Resource res1 = new ClassPathResource("spconfig1.xml");
		BeanFactory factory1 = new XmlBeanFactory(res1);
 
		Resource res2 = new ClassPathResource("spconfig2.xml");
		BeanFactory factory2 = new XmlBeanFactory(res2, factory1);
 
		Object o = factory2.getBean("id3");
		Journey j = (Journey)o;
 
		j.startJourney();
		
		Object o1 = factory1.getBean("id1");
		Vehicle j1 = (Vehicle)o1;
 
		j1.move();
 
	}
 
}