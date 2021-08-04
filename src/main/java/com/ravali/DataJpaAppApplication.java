package com.ravali;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ravali.entity.UserEntity4;
import com.ravali.entity.repo.UserRepository;

@SpringBootApplication
public class DataJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaAppApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		UserEntity4 entity4 = new UserEntity4();
	/*	entity4.setEname("sony");
		entity4.setEmail("sony@gmail.com");
		entity4.setAge(22);
		UserEntity4 save = repository.save(entity4);
		System.out.println(save);*/
		List<UserEntity4> findAll = repository.findAll();
		System.out.println(findAll);
	/*	Example<UserEntity4> of = Example.of(entity4);
		List<UserEntity4> findAll2 = repository.findAll(of);
		findAll2.forEach(action->System.out.println(action));*/
		PageRequest of = PageRequest.of(0, 3);
		Page<UserEntity4> findAll2 = repository.findAll(of);
		findAll2.forEach(action->System.out.println(action));
		
		
		

	}

}
