package com.sspver.WSSCSFASP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WsScsfaspApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsScsfaspApplication.class, args);
	}

//	@Controller
//	public static class Api {
//
//		@GetMapping("/")
//		public String index() {
//			return "index.html";
//		}
//	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath("/");
	}

}
