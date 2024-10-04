package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pojo") // package scan OR -> one way
//@ComponentScan({"pojo"}) // OR -> second way
//@ComponentScan(basePackages = {"pojo"}) // for multiple beans -> third way
public class ConfigurationFile {
	
}
