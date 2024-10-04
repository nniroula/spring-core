package fieldBasedDI;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldBasedDIAppLauncher {
	public static void main(String []args) {
		System.out.println(" *** Field/Variable based Dependency Injection in Spring *** ");
		
		try(var context = new AnnotationConfigApplicationContext(FieldBasedDIJavaConfigFile.class))
		{
			System.out.println(context.getBean(FieldBasedInjection.class));
			System.out.println("---------------------");
			
			// all beans
			System.out.println("All created beans are...");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
