package br.com.teainfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teainfo.dao.BlogPartnerRepository;
import br.com.teainfo.model.BlogPartner;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/blogs")
public class BlogPartnerController {
	
	@Autowired
	private BlogPartnerRepository blogPartnerRepo;
	
	@GetMapping
	public ResponseEntity<List<BlogPartner>> findAll() {
		List<BlogPartner> blogs = blogPartnerRepo.findAll();
		return ResponseEntity.ok().body(blogs);
	}
}
