package org.spring.http.converter.example;

import org.spring.http.converter.jsonfilter.JsonFilterJackson2HttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class WebConfig {

	@Bean
	MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(ObjectMapper objectMapper) {
		return new JsonFilterJackson2HttpMessageConverter(objectMapper);
	}
}
