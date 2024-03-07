package com.sspver.WSSCSFASP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WsScsfaspApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsScsfaspApplication.class, args);
	}

	@RestController
	public static class Api {
		private final JdbcTemplate jdbcTemplate;

		public Api(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		@GetMapping
		public String time() {
			final String namestamp = jdbcTemplate.queryForObject("select DB_NAME() AS myDb", String.class);
			return "Successful Connection to " + namestamp + " Database.";
		}
	}

}
