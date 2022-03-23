package br.com.teainfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teainfo.dao.BlogPartnerRepository;
import br.com.teainfo.dao.BlogPostRepository;
import br.com.teainfo.model.BlogPartner;
import br.com.teainfo.model.BlogPost;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/posts")
public class BlogPostController {
	
	
//	@Autowired
//	private BlogPartnerRepository blogPartnerRepo;
	
	@Autowired BlogPostRepository blogPostRepo;
	
	@GetMapping
	public ResponseEntity<List<BlogPost>> findAll() {
		List<BlogPost> posts = blogPostRepo.findAll();
		return ResponseEntity.ok().body(posts);
	}
}
