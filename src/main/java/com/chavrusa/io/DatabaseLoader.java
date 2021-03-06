//package com.chavrusa.io;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.chavrusa.repository.UserRepository;
//
//@Component
//public class DatabaseLoader implements CommandLineRunner {
//	private final UserRepository repository;
//
//	@Autowired
//	public DatabaseLoader(UserRepository repository) {
//		this.repository = repository;
//	}
//
//	@Override
//	public void run(String... strings) throws Exception {
//		this.repository.save(new User("Sarita", "Akshaya"));
//	}
//}
