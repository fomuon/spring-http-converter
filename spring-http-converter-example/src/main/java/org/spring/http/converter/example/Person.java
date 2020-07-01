package org.spring.http.converter.example;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class Person {
	private int id;

	private String name;

	private int age;

	private List<Phone> phones;
}
