package employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import log.Log;
import souspackage.App;
import souspackage.MyService;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		MyService Monservice = context.getBean(MyService.class);
		Monservice.doTheJob("Patate");
		
		Log log = new Log();
		log.logGet("test");
	}
}
