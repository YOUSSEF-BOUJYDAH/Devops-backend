package com.example.backend;

import com.example.backend.Users.User;
import com.example.backend.Users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
@Autowired
	UserRepository UR;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u=new User();
		u.setName("Youssef");
		u.setCity("Taza");
		UR.save(u);
		User u2=new User();
		u2.setName("Youssef");
		u2.setCity("Taza");
		UR.save(u2);
		User u3=new User();
		u3.setName("Youssef");
		u3.setCity("Taza");
		UR.save(u3);
		User u4=new User();
		u4.setName("Youssef");
		u4.setCity("Taza");
		UR.save(u4);
		User u5=new User();
		u5.setName("Youssef");
		u5.setCity("Taza");
		UR.save(u5);
	}
}
