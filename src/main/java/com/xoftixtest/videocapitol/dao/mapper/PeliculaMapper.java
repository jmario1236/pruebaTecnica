package com.xoftixtest.videocapitol.dao.mapper;

import java.util.List;

import com.xoftixtest.videocapitol.models.Pelicula;


public interface PeliculaMapper {
	public void insertar(Pelicula p);
	public List<Pelicula> busquedaParametrizada(Pelicula p);
	public List<Pelicula> listar();
	public void actualizar(Pelicula p);
}
