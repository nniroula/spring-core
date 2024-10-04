package fieldBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


@Component
public class FieldBasedInjection {
	@Autowired
	Dependency1 dependencyOne;
	
	@Autowired
	Dependency2 dependencyTwo;
	
	
	
	@Override
	public String toString() {
		return "Accessing dependency one = " + dependencyOne + " and dependency two = " + dependencyTwo;
	}
	
}
