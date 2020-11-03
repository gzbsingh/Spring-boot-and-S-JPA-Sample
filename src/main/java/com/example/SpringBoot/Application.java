package com.example.SpringBoot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringBoot.Repository.UserRepository;
import com.example.SpringBoot.utils.User;
import com.sun.xml.bind.v2.schemagen.xmlschema.Appinfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(Application.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
		/*Create
		 * User user=new User(); user.setCity("SRE"); user.setName("Raman"); User
		 * user1=new User(); user1.setCity("GZB"); user1.setName("RamanJEET");
		 * List<User> list=new ArrayList<User>(); list.add(user); list.add(user1);
		 * 
		 * Iterable<User> itr=userpository.saveAll(list); itr.forEach(action-> {
		 * System.out.println(itr); });
		 */
		/*update
		 * Optional<User> optional=userpository.findById(2); User user=optional.get();
		 * user.setName("Ankit"); userpository.save(user); System.out.println(user);
		 */
		//Read

	//Delete
	//userRepository.deleteById(5);
		/*
		 * Iterable<User> itr1=userRepository.findAll(); itr1.forEach(user->{
		 * System.out.println(user); });
		 */
  //  user=userRepository.findByNameAndCity("Ankit","GZB");
	
	/*List<User> user=userRepository.findByNameStartingWith("R");
user.forEach(e->{
	
	System.out.println(e);
});*/
	
	}
	
	
}
