package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import config.JavaConfig;
import game.GameRunner;
import game.MarioGame;
import game.PacManGame;
import game.SupercontraGame;


public class AppLauncher {
	public static void main(String []args) {
		System.out.println("App Launcher for @Component and @ComponentScan implementation...");
		System.out.println();
		
		//try with resources
		try(var context = new AnnotationConfigApplicationContext(JavaConfig.class))
		{
			
			context.getBean(GameRunner.class).run();  // get bean from GameRunner class
			System.out.println("-------------------------------------");
			
			context.getBean(MarioGame.class).left(); // MarioGame
			
			System.out.println("-------------------------------------");
			
			context.getBean(SupercontraGame.class).right();
			
			System.out.println("-------------------------------------");
			
			context.getBean(PacManGame.class).up();
		}
	}
}
