package springBean;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.ApplicationContext;

public class AppLauncher {
	public static void main(String []args) {
		System.out.println(" *** Spring beans... ***");
		System.out.println();
		
		// use try with resource to avoid resources(context leaking) - context is of type ApplicationContext
		try(var context = new AnnotationConfigApplicationContext(JavaConfiguration.class)){
			
			/* access beans using context.getBean("bean name") approach */
			
			// bean 1
			String nameFromConfigFile = (String)context.getBean("getName"); // cast it b/c context returns Object type object
			System.out.println("Name from getName bean in java configuration file is");
			System.out.println(nameFromConfigFile);
			System.out.println("-------------------------");
			System.out.println();
			
			// bean 2
			String job = (String)context.getBean("profession");
			System.out.println("Occupation from profession bean in java configuration file is");
			System.out.println(job);
			System.out.println("-------------------------");
			System.out.println();
			
			// 3rd bean
			Person person = (Person)context.getBean("getPerson");
			System.out.println("Person from getPerson bean in java configuration file is");
			System.out.println(person);
			System.out.println("-------------------------");
			System.out.println();
			
			// 4th bean
			Person secondPerson = (Person) context.getBean("getSecondPerson");
			System.out.println("Person from getSecondPerson bean in java configuration file is");
			System.out.println(secondPerson);
			System.out.println("-------------------------");
			System.out.println();
			
			//5th bean - made up of bean 1 and 2
			String combinedBean = (String) context.getBean("getBeanMadeUpOfBeanOneAndBeanTwo");
			System.out.println("Bean from getBeanMadeUpOfBeanOneAndBeanTwo bean in java configuration file is");
			System.out.println(combinedBean);
			System.out.println("-------------------------");
			System.out.println();
			
			//6th bean - parameterized bean using bean 1 and 2
			Person parameterizedBean = (Person) context.getBean("getParameterizedBean");
			System.out.println("Bean from getParameterizedBean bean in java configuration file is");
			System.out.println(parameterizedBean);
			System.out.println("-------------------------");
			System.out.println();
			
			
			/* access beans using context.getBean("BeanClass.class") approach */
			
//			 context.getBean(JavaConfiguration.class); // should throw multiple candidate bean error, but does not throw it
			
			//bean - 7
			 Backend techOne = context.getBean(JavaConfiguration.class).techInfoOne();
			System.out.println("Bean from techInfoOne bean in java Config file is");
			System.out.println(techOne);
			System.out.println("-------------------------");
			System.out.println();
			
			// get all bean definitions
			System.out.println("All Beans are...");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			// bean - 8
		}
	}
}
