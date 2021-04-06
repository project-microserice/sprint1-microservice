package com.example.demo.enums;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authorities implements GrantedAuthority{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	
	private Long authorities_id;
	
	private String authorities_name;

	
	public Authorities() {
		super();
	}

	public Authorities(Long id, Long authorities_id, String authorities_name) {
		super();
		this.id = id;
		this.authorities_id = authorities_id;
		this.authorities_name = authorities_name;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authorities_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAuthorities_id() {
		return authorities_id;
	}

	public void setAuthorities_id(Long authorities_id) {
		this.authorities_id = authorities_id;
	}

	public String getAuthorities_name() {
		return authorities_name;
	}

	public void setAuthorities_name(String authorities_name) {
		this.authorities_name = authorities_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
