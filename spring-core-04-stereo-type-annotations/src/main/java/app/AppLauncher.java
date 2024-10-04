package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import businessCalculation.MaxValue;
import javaConfigFile.JavaConfigurationFile;

public class AppLauncher {

	public static void main(String[] args) {
		System.out.println(" *** Spring @Component and steoreo type annotations ***");
		System.out.println("--------------------------");
		
		// annotation context using try with resource approach in java
		try(var context = new AnnotationConfigApplicationContext(JavaConfigurationFile.class))
		{
			System.out.println("Maximum value using @Primary annotation in Mysql file is...");
			System.out.println(context.getBean(MaxValue.class).getMaxValue());
			
			System.out.println("--------------------------");
			
		}
	}
}
