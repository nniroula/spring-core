package looseCoupling;

interface GameInterface{
	void left();
	void right();
	void up();
	void down();
}


//game 1
class MarioGame implements GameInterface{
	@Override
	public void left() {
		System.out.println("Mario --> LEFT");
	}
	
	@Override
	public void right() {
		System.out.println("Mario --> RIGHT");
	}
	
	@Override
	public void up() {
		System.out.println("Mario --> UP");
	}
	
	@Override
	public void down() {
		System.out.println("Mario --> DOWN");
	}
}


//game 2
class SupercontraGame implements GameInterface{
	@Override
	public void left() {
		System.out.println("Supercontra --> LEFT");
	}
	
	@Override
	public void right() {
		System.out.println("Supercontra --> RIGHT");
	}
	
	@Override
	public void up() {
		System.out.println("Supercontra --> UP");
	}
	
	@Override
	public void down() {
		System.out.println("Supercontra --> DOWN");
	}
}


//Game Runner class that runs games
class GameRunner{
	private GameInterface gameInterface; // interface type
	
	//constructor with interface as parameter type
	public GameRunner(GameInterface gameInterf) {
		this.gameInterface = gameInterf; // Loosely coupled due to use of interface as GameRunner does not directly depend on Mario Class.
	}
	
	public void runGames() {
		gameInterface.left();
		gameInterface.right();
		gameInterface.up();
		gameInterface.down();
	}
}


public class App {
	public static void main(String []args) {
		System.out.println();
		System.out.println("Loose Coupling achieved using interface... ");
		System.out.println();
		
		System.out.println("Game Runner class with Mario Game parameterized constructor call...");
		MarioGame mGame = new MarioGame();
		GameRunner gRunnerTwo = new GameRunner(mGame);
		gRunnerTwo.runGames();
		
		System.out.println();
		System.out.println("Game Runner class with Supercontra Game parameterized constructor call...");
		SupercontraGame sGame = new SupercontraGame();
		GameRunner gRunnerThree = new GameRunner(sGame);
		gRunnerThree.runGames();
	}
}
