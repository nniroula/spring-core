package constructorBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


@Component
public class ConstructorBasedInjection {

	Dependency1 dependencyOne;
	Dependency2 dependencyTwo;
	
	@Autowired
	public ConstructorBasedInjection(Dependency1 dependencyOne, Dependency2 dependencyTwo) {
		super();
		System.out.println("In Constructor - Constructor based dependency ");
		this.dependencyOne = dependencyOne;
		this.dependencyTwo = dependencyTwo;
	}


	@Override
	public String toString() {
		return "Accessing dependency one = " + dependencyOne + " and dependency two = " + dependencyTwo;
	}
	
}
