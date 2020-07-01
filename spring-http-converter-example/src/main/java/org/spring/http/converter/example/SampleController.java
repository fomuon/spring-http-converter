package org.spring.http.converter.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/people")
	public List<Person> getPeople() {

		return Arrays.asList(
				Person.of(1, "lee", 10, Arrays.asList(
						Phone.of(1, "010", "iPhone"),
						Phone.of(2, "011", "galaxy")))
		);
	}
}
