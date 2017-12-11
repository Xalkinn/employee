package log;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	@Around("execution(* get*(..))")
	public void logGet(Object Valeur) {
		System.out.println("Voici un log " + Valeur);
	}
}
