package com.prueba.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	private Integer id;
	
	@Column
	private String name_artist;
	
	@Column
	private String descript;
	
	@Column
	private String genre;
	
	@Column
	private Date birthdate;
	
	
	/*----> GETTERS AND SETTERS <----*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName_artist() {
		return name_artist;
	}

	public void setName_artist(String name_artist) {
		this.name_artist = name_artist;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	
	
}
