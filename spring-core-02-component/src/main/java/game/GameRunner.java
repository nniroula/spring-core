package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* Runs all three games here */

@Component
public class GameRunner {
	// Interface type data
	Interface gameInterface;
	
	//constructor
	public GameRunner(@Qualifier("SuperContraGameQualifier") Interface interf) { //GameRunner in app launcher class takes in Mario game type b/c Mario game implements interface
		this.gameInterface = interf;
	}
	
	// method to call all interface methods
	public void run() {
		gameInterface.left();
		gameInterface.right();
		gameInterface.up();
		gameInterface.down();
	}
}