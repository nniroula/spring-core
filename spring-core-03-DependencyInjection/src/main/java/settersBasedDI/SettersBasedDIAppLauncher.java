package settersBasedDI;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fieldBasedDI.FieldBasedDIJavaConfigFile;
import fieldBasedDI.FieldBasedInjection;

public class SettersBasedDIAppLauncher {
	public static void main(String []args) {
		System.out.println(" *** Setters Based Dependency Injection in Spring *** ");
		
		try(var context = new AnnotationConfigApplicationContext(SettersBasedDIJavaConfigFile.class))
		{
			System.out.println(context.getBean(SettersBasedInjection.class));
			System.out.println("---------------------");
			
			// all beans
			System.out.println("All created Setters Based Dependency Injection beans are...");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
