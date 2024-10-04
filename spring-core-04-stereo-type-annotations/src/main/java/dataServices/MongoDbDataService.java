package dataServices;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import interfaceForDataService.DataServiceInterface;


//@Component
@Service
public class MongoDbDataService implements DataServiceInterface{

	@Override
	public int[] getData() {
		int [] numbers = new int[5];

		for(int i = 1; i<= numbers.length; i++) {
			numbers[i] = i*2;
		}
		return numbers;
	}

}
