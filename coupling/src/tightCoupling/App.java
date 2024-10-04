package tightCoupling;

class MarioGame{
	
	public void left() {
		System.out.println("Mario --> LEFT");
	}
	public void right() {
		System.out.println("Mario --> RIGHT");
	}
	public void up() {
		System.out.println("Mario --> UP");
	}
	public void down() {
		System.out.println("Mario --> DOWN");
	}
}


//Game Runner class that runs games
class GameRunner{
	private MarioGame mGame;
	
	//constructor - 1
	public GameRunner() {
		mGame = new MarioGame(); // Tightly coupled to Mario Game class - new keyword
	}
	
	//constructor - 2
	public GameRunner(MarioGame mGame) {
		this.mGame = mGame; // Still tightly coupled b/c GameRunner depends on MarioGame class
	}
	
	public void runGames() {
		mGame.left();
		mGame.right();
		mGame.up();
		mGame.down();
	}
}


public class App {
	public static void main(String []args) {
		System.out.println("Tight Coupling in Java... ");
		System.out.println();
		
		System.out.println("Game Runner with No-Args Constructor call...");
		GameRunner gRunner = new GameRunner();
		gRunner.runGames();
		System.out.println();
		
		System.out.println("Game Runner class with Mario Game parameterized constructor call...");
		MarioGame mGame = new MarioGame();
		GameRunner gRunnerTwo = new GameRunner(mGame);
		gRunnerTwo.runGames();
		
		
	}
}
