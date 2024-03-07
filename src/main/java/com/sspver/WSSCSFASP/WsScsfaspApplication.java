package com.sspver.WSSCSFASP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WsScsfaspApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsScsfaspApplication.class, args);
	}

	@Controller
	public static class Api {

		@GetMapping("/")
		public String index() {
			return "index.html";
		}
	}

}
