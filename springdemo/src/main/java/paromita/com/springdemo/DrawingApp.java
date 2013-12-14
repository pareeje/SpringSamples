package paromita.com.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args )
    {
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
    }
}
