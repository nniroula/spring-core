package game;

import org.springframework.stereotype.Component;


@Component
public class PacManGame implements Interface{

	@Override
	public void left() {
		System.out.println("PacMan -> LEFT");
	}

	@Override
	public void right() {
		System.out.println("PacMan -> RIGHT");	
	}

	@Override
	public void up() {
		System.out.println("PacMan -> UP");
	}

	@Override
	public void down() {
		System.out.println("PacMan -> DOWN");
	}

}
