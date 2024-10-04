package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("SuperContraGameQualifier") // pass this qualifier as a parameter in GameRunner. This game gets preference when spring picks up the bean from multiple candidate beans
public class SupercontraGame implements Interface{

	@Override
	public void left() {
		System.out.println("Supercontra -> LEFT");
	}

	@Override
	public void right() {
		System.out.println("Supercontra -> RIGHT");	
	}

	@Override
	public void up() {
		System.out.println("Supercontra -> UP");
	}

	@Override
	public void down() {
		System.out.println("Supercontra -> DOWN");
	}

}
