package org.spring.http.converter.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class Phone {

	private int id;

	private String num;

	private String model;
}
