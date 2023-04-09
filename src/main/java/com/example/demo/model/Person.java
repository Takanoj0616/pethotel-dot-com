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

	/**
	 * <p>
	 * 項目名：名前
	 * </p>
	 * <p>
	 * 必須入力かつ、最大10文字まで
	 * </p>
	 */
	@NotBlank
	@Size(max = 10)
	private String name;

	/**
	 * <p>
	 * 項目名：年齢
	 * </p>
	 * <p>
	 * 1以上
	 * </p>
	 */
	@NotNull
	@Min(1)
	private Integer age;

	/**
	 * <p>
	 * 項目名：住所
	 * </p>
	 * <p>
	 * 必須入力かつ、最大10文字まで
	 * </p>
	 */
	@NotBlank
	@Size(max = 30)
	private String address;

	/**
	 * <p>
	 * 項目名：メールアドレス
	 * </p>
	 * <p>
	 * 条件：必須入力かつ、最大64文字まで
	 * </p>
	 */
	@NotBlank
	@Email
	@Size(max = 64)
	private String email;
}