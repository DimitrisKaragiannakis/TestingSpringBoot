package com.example.ju.jutest1;

import com.example.ju.jutest1.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


/*
*tests  if the application context cannot start
*test fails if controller obj is null
*
* */
@SpringBootTest
class Jutest1ApplicationTests {

	@Autowired
	private HomeController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}

