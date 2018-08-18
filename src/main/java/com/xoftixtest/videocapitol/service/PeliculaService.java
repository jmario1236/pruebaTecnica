package com.xoftixtest.videocapitol.service;

import java.util.List;

import com.xoftixtest.videocapitol.models.Pelicula;

public interface PeliculaService {
	public void agregarPelicula(Pelicula p);
	public List<Pelicula> busquedaPeliculaParametrizada(Pelicula p);
	public List<Pelicula> listarPeliculas();
	public void actualizarPelicula(Pelicula p);
}
