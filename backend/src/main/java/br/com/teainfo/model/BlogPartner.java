package br.com.teainfo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "blogs")
public class BlogPartner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_blog;
	
	private String name,url;
	
	
	@OneToMany(mappedBy = "blogPartner")
	private List<BlogPost> posts = new ArrayList<BlogPost>();

	public BlogPartner() {
		super();
	}

	public BlogPartner(String name, String blogUrl) {
		super();
		this.name = name;
		this.url = blogUrl;
	}

	public long getId_blogpartner() {
		return id_blog;
	}

	public void setId_blogpartner(long id_blogpartner) {
		this.id_blog = id_blogpartner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlogUrl() {
		return url;
	}

	public void setBlogUrl(String blogUrl) {
		this.url = blogUrl;
	}

	public List<BlogPost> getBlogPost() {
		return posts;
	}

	public void setBlogPost(List<BlogPost> blogPost) {
		this.posts = blogPost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_blog);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogPartner other = (BlogPartner) obj;
		return id_blog == other.id_blog;
	}
	
	

}
