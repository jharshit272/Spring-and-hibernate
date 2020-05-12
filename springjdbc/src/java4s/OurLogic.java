package java4s;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class OurLogic
{
	public static void main(String args[])
	{
		Resource res = new ClassPathResource("spconfig.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//For Resource bundle
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("/jdbcBund.properties"));
		ppc.postProcessBeanFactory(factory);
		
		SpringJdbcCreateTable st =(SpringJdbcCreateTable)factory.getBean("id3");
	//	st.createTable();
	//	st.insertRow();
		st.loadAll();
	}
}