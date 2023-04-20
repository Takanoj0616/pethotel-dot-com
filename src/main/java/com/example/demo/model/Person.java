package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue
	private long id;

	@NotBlank
	@Size(max = 10)
	private String name;

	@NotNull
	@Min(1)
	private Integer age;

	@NotBlank
	@Size(max = 30)
	private String address;

	@NotBlank
	@Email
	@Size(max = 64)
	private String email;
}