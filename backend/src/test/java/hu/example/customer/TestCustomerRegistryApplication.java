package hu.example.customer;

import org.springframework.boot.SpringApplication;

public class TestCustomerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.from(CustomerRegistryApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
