package settersBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


@Component
public class SettersBasedInjection {
	
	Dependency1 dependencyOne;
	Dependency2 dependencyTwo;
	
	// settters
	
	@Autowired
	public void setDependencyOne(Dependency1 dependencyOne) {
		System.out.println("Autowired in setter for dependency 1.");
		this.dependencyOne = dependencyOne;
	}

	@Autowired
	public void setDependencyTwo(Dependency2 dependencyTwo) {
		System.out.println("Autowired in setter for dependency 2.");
		this.dependencyTwo = dependencyTwo;
	}


	@Override
	public String toString() {
		return "Accessing dependency one = " + dependencyOne + " and dependency two = " + dependencyTwo;
	}
	
}
