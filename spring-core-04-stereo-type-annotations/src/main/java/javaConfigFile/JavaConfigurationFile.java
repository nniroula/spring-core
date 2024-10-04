package javaConfigFile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dataServices")
@ComponentScan("businessCalculation")
public class JavaConfigurationFile {
	
}
