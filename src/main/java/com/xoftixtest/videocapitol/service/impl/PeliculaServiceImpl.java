package com.xoftixtest.videocapitol.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xoftixtest.videocapitol.dao.mapper.PeliculaMapper;
import com.xoftixtest.videocapitol.models.Pelicula;
import com.xoftixtest.videocapitol.service.PeliculaService;

@Service("peliculaService")
public class PeliculaServiceImpl implements PeliculaService {
	
	@Resource
	private PeliculaMapper peliculaMapper;

	public void agregarPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		this.peliculaMapper.insertar(p);

	}

	public List<Pelicula> busquedaPeliculaParametrizada(Pelicula p) {
		// TODO Auto-generated method stub
		return this.peliculaMapper.busquedaParametrizada(p);
	}

	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return this.peliculaMapper.listar();
	}

	public void actualizarPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		this.peliculaMapper.actualizar(p);
	}

}
