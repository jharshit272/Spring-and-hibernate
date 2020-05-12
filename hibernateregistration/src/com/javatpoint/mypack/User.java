package com.javatpoint.mypack;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "hibernateregistration")

public class User {  
	private int id;  
	private String name, password, email;
	private String[] languages;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
	private List<String> languageList;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getLanguages() {
		
		return languages;
	}
	
	public void setLanguages(String[] languages) {
		setLanguageList(Arrays.asList(languages));
		this.languages = languages;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
	public List<String> getLanguageList() {
		return languageList;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
	public void setLanguageList(List<String> languageList) {
		this.languageList = languageList;
	}
	
	
}  