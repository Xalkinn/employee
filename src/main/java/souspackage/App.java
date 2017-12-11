package souspackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan défini une route
@ComponentScan
public class App {
	public App() {
		System.out.println("Start created");
	}
}
