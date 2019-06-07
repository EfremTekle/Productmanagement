package edu.mum.cs.cs425.prodmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import edu.mum.cs.cs425.prodmgmt.repository.ProductRepository;

@SpringBootApplication
public class MyProductMgmtAppApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productrepo;

	public static void main(String[] args) {
		SpringApplication.run(MyProductMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Pdoduct Managment");
		Product product=new Product(1001,"iPhone XS Max",1500.00f,LocalDate.of(2018,10,24));
		Product prosaved= productrepo.save(product);
		System.out.println(prosaved);
		
	}

}
