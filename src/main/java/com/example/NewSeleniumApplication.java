package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSeleniumApplication {

	public static void main(String[] args) {
		LoginGui login = new LoginGui();
		login.run();
	}

}
