package com.example.redis_example;

import com.example.redis_example.model.Student;
import com.example.redis_example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RedisExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		studentRepository.deleteAll();

		// 1. save
		Student student = Student.builder()
				.name("John Doe")
				.gender(Student.Gender.MALE)
				.grade(50)
				.build();
		student = studentRepository.save(student);
		System.out.println(student);

		// 2. findAll
		Iterable<Student> students = studentRepository.findAll();
		students.forEach(System.out::println);

		student = studentRepository.findById(student.getId()).get();
		System.out.println(student);

		// 3. Updating
		student.setName("Richard Watson");
		student = studentRepository.save(student);
		System.out.println(student);

		// 4. Deleting
		studentRepository.deleteById(student.getId());
	}
}
