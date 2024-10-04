package constructorBasedDI;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorBasedDIAppLauncher {
	public static void main(String []args) {
		System.out.println(" *** Constructor based Dependency Injection in Spring *** ");
		System.out.println("---------------------");
		
		try(var context = new AnnotationConfigApplicationContext(ConstructorBasedDIJavaConfigFile.class))
		{
			System.out.println(context.getBean(ConstructorBasedInjection.class));
			System.out.println("---------------------");
			
			// all beans
			System.out.println("All constructor based dependency injection created beans are...");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
