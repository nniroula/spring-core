package businessCalculation;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import interfaceForDataService.DataServiceInterface;


@Component
public class MaxValue {
	DataServiceInterface dataServiceInterf;
	
	// Constructor based dependency injection
	public MaxValue(DataServiceInterface dataServiceInterf) {
		super();
		this.dataServiceInterf = dataServiceInterf;
	}


	public int getMaxValue() {
		int maxValue = Arrays.stream(dataServiceInterf.getData()).max().orElse(0);
		return maxValue;
	}
}
