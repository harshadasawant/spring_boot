package com.example.demo;

import com.example.demo.bean.Book;
import com.example.demo.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
//The @SpringBootApplication annotation is a combination of following three Spring annotations and provides the functionality of all three with just one line of code.
//
//@Configuration
//This annotation marks a class as a Configuration class for Java-based configuration. This is particularly important if you favor Java-based configuration over XML configuration.
//
//@ComponentScan
//This annotation enables component-scanning so that the web controller classes and other components you create will be automatically discovered and registered as beans in Spring's Application Context. All the@Controller classes you write are discovered by this annotation.
//
//@EnableAutoConfiguration
//This annotation enables the magical auto-configuration feature of Spring Boot, which can automatically configure a lot of stuff for you.
@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {
	@Autowired
	private BookRepository repository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Customer cust = context.getBean(Customer.class);
		cust.disaply();
		System.out.println("Hello world!");


		}


	@Override
	public void run(String... args) throws Exception {


		repository.save(new Book("Java"));
		repository.save(new Book("Node"));
		repository.save(new Book("Python"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		repository.findByName("Node").forEach(x -> System.out.println(x));

	}
}
