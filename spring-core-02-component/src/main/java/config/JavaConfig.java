package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import game.GameRunner;
import game.Interface;
import game.MarioGame;

@Configuration
@ComponentScan("game") // game is a package where Mario game is located
public class JavaConfig {

}