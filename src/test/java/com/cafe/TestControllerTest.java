package com.cafe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cafe.domain.Product;
import com.cafe.enums.ProductType;
import com.cafe.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void 상품엔티티테스트() throws Exception {
		Product product = new Product();
		// product.setType(ProductType.DRINK);
		product.setType(ProductType.FOOD);
		product.setNameKor("아메리카노");
		product.setNameEng("Americano");
		product.setDescription("아메리카노입니다");

		System.out.println("product : " + product);
		
		productRepository.save(product);
	}
}
