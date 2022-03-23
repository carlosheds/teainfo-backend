package br.com.teainfo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.teainfo.dao.BlogPartnerRepository;
import br.com.teainfo.dao.BlogPostRepository;
import br.com.teainfo.model.BlogPartner;
import br.com.teainfo.model.BlogPost;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
	
	@Autowired
	private BlogPartnerRepository blogPartnerRepo;
//	
	@Autowired
	private BlogPostRepository blogPostRepo;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		BlogPartner blog1 = new BlogPartner("Autismo em adultos 1","https://blogsport.com");
//		BlogPartner blog2 = new BlogPartner("Autismo em adultos 2","https://blogsport.com");
////		
////
//		BlogPost post1 = new BlogPost("https://img.com","Autismo em Adultos","lorem ipsum dolor sit amet consectus","https://blogspot.com.br","Blog do autismo em adultos");
//		BlogPost post2 = new BlogPost("https://img2.com","Autismo em Adultos 2","lorem ipsum dolor sit amet consectus","https://blogspot.com.br","Blog do autismo em adultos");
////		
//		blog1.getBlogPost().addAll(Arrays.asList(post1));
//		blog2.getBlogPost().addAll(Arrays.asList(post2));
////		
//		blogPartnerRepo.save(blog1);
//		blogPartnerRepo.save(blog2);
////		
////		
//		blogPostRepo.save(post1);
//		blogPostRepo.save(post2);

	}

}
