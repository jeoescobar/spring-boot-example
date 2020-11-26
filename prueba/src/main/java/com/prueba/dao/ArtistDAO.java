package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Artist;

public interface ArtistDAO extends JpaRepository<Artist, Integer>{

}
