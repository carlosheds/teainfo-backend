package br.com.teainfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teainfo.model.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{

}
