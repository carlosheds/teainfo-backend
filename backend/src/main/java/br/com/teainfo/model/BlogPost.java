package br.com.teainfo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "posts")
public class BlogPost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_post;
	
	private String img, title, description;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_blog")
	private BlogPartner blogPartner;
	
	public BlogPost() {
		super();
	}

	public BlogPost(String imgUrl, String title, String description) {
		super();
		this.img = imgUrl;
		this.title = title;
		this.description = description;
	}

	public Long getId_blogPost() {
		return id_post;
	}

	public void setId_blogPost(Long id_blogPost) {
		this.id_post = id_blogPost;
	}

	public String getImgUrl() {
		return img;
	}

	public void setImgUrl(String imgUrl) {
		this.img = imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_post);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogPost other = (BlogPost) obj;
		return Objects.equals(id_post, other.id_post);
	}
	
	
}
