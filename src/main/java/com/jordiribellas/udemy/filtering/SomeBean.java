package com.jordiribellas.udemy.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@JsonIgnoreProperties("field1")
public class SomeBean {

	private String field1;
	
	@JsonIgnore
	private String field2;
	private String field3;

}
