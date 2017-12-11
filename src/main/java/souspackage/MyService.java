package souspackage;

import org.springframework.stereotype.Service;

//Le @service pour dire que c'est un bean
@Service
public class MyService {
	public void MyService() {
		System.out.println("MyService");
	}
	
	public void doTheJob(String job) {
		System.out.println(job);
	}
}
