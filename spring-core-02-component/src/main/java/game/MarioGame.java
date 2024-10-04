package game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary // to make default bean if multiple candidates are present
public class MarioGame implements Interface{

	@Override
	public void left() {
		System.out.println("Mario -> LEFT");
	}

	@Override
	public void right() {
		System.out.println("Mario -> RIGHT");	
	}

	@Override
	public void up() {
		System.out.println("Mario -> UP");
	}

	@Override
	public void down() {
		System.out.println("Mario -> DOWN");
	}

}
