package org.spring.http.converter.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
@AutoConfigureMockMvc
class SampleControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	void testGetPeople() throws Exception {

		mvc.perform(get("/people"))
				.andDo(MockMvcResultHandlers.print());
	}
}
