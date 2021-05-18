package com.online.foodDelivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.online.foodDelivery.model.User;
import com.online.foodDelivery.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepoTest {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser(){
		User user=new User();
		
		user.setFirst_name("Admin");
		user.setLast_name("Admin");
		user.setLogin("Admin1");
		user.setPassword("123");
		user.setContact_no("8928192892");
		user.setEmail("gps@gmail.com");
		user.setUserId(100100);
		user.setRoleId(1);
		//user.setCreatedBy(Date);
	}
}
