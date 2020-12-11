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
public class Member {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	private String nickName;
}
