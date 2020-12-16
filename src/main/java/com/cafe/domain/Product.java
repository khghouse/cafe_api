package com.cafe.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cafe.enums.ProductType;

import lombok.Data;

@Entity
@Table
@Data
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Enumerated(EnumType.STRING)
	private ProductType	type;
	
	private String		nameKor;
	private String		nameEng;
	private String		description;

}