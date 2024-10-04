package dataServices;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import interfaceForDataService.DataServiceInterface;


//@Component
@Service
@Primary
public class MySqlDataService implements DataServiceInterface{

	@Override
	public int[] getData() {
		return new int[]{1, 2, 3, 4, 5};
	}

}
