package paromita.com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args )
    {
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
        
        GeoTriangle geoTriangle = (GeoTriangle)context.getBean("geoTriangle");
        geoTriangle.draw();
    }
}
