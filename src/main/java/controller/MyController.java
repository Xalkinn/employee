package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import souspackage.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService service;
	
	public String get() {
		return "Get function";
	}
}
