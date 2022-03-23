package br.com.teainfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teainfo.model.BlogPartner;

@Repository
public interface BlogPartnerRepository extends JpaRepository<BlogPartner, Long>{

}
