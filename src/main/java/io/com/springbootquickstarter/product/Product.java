package io.com.springbootquickstarter.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
    @Id
	private String id;
	private String name;
	private String version;
	
	public Product() {
		
	}
	
	public Product(String id, String name, String version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}

