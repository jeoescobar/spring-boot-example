package com.prueba.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dao.ArtistDAO;
import com.prueba.model.Artist;

@RestController
@RequestMapping("artist")
public class ArtistRest {
	
	@Autowired
	private ArtistDAO artistDAO;
	
	//METODOS HTTP - SOLICITUD AL SERVIDOR
	
	@PostMapping("/newartist")
	public void save_artist(@RequestBody Artist art) {
		artistDAO.save(art);
		
	}
	
	@GetMapping("/getartist")
	public List<Artist> getArtists(){
		return artistDAO.findAll();
		
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Artist art){
		artistDAO.deleteById(art.getId());
		
	}
	
	@PostMapping("/updateartists")
	public String updateArtist(@RequestBody Artist art) {
		String msj="";
		int ida = art.getId();
		if(ida == 0  || artistDAO.findById(ida).isEmpty() ) {
			msj = "Bad ID";
			
		}else {
			
			artistDAO.save(art);
			msj = "Artist Updated";
			
		}
		
		
		//System.out.println(msj);
		return msj;
	}

}
