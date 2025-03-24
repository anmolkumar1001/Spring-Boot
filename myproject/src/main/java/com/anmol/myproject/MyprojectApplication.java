package com.anmol.myproject;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MyprojectApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		User user = new User();
//		user.setName("Anmol Kumar");
//		user.setCity("Sitamrhi");
//		user.setStatus("I am Software Engineer");
//		
//		User user1 = userRepo.save(user);
//		
//		System.out.println(user1);
		
		
		// Create object of user
//		User user1 = new User();
//		user1.setName("Kumar");
//		user1.setCity("Bangalore");
//		user1.setStatus("Software Developer");
//		
//		User user2 = new User();
//		user2.setName("Kumar");
//		user2.setCity("Sonbarsa");
//		user2.setStatus("Java Developer");
		
		
		// Saving single user
		// User resUser = userRepo.save(user2);
		
		
		// to save multiple users
		// List<User> users = List.of(user1, user2);
		// Iterable<User> res = userRepo.saveAll(users);
		
//		 res.forEach(user -> {
//			System.out.println(user);
//		});
//		
//		
//		// System.out.println("Saved user " + resUser);
//		System.out.println("Done!");
		
		
		// Update the user id 52
//		Optional<User> optional = userRepo.findById(52);
//		User user = optional.get();
//		
//		user.setName("Aarushi");
//		
//		User res = userRepo.save(user);
//		
//		System.out.println(res);
		
		
		// How to get the data
		// findById(id) - return optional containing your data
		// Iterable<User> itr = userRepo.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext())
//		{
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		// New method
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		// lambda function for get data
		// itr.forEach(user -> {System.out.println(user);});
		
		
		// Deleting the user Element
//		userRepo.deleteById(2);
//		System.out.println("deleted");
		
		// Delete multiple users
		Iterable<User> allusers = userRepo.findAll();
		
		allusers.forEach(user -> System.out.println(user));
		
		userRepo.deleteAll(allusers);
	}

}
