package com.cafe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	private Short	type;
	private String	nameKor;
	private String	nameEng;
	private String	description;

}
