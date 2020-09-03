package com.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestingTheWebLayerApplicationTests {

	@Autowired
	private HomeController controller;

	@Test
	void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
