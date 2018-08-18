package com.xoftixtest.videocapitol.controller;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;

import com.xoftixtest.videocapitol.models.Pelicula;
import com.xoftixtest.videocapitol.service.PeliculaService;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class PeliculaController extends SelectorComposer<Component>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@WireVariable(rewireOnActivate = true)
	private PeliculaService peliculaService;
	
	@Wire
	private Grid listadoView;
	
	
	private ListModelList<Pelicula> modelList = new ListModelList<Pelicula>();
	private List<Pelicula> peliculas;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		modelList = new ListModelList<Pelicula>();
		modelList.addAll(this.peliculaService.listarPeliculas());
		listadoView.setModel(modelList);		
	}

	public PeliculaService getPeliculaService() {
		return peliculaService;
	}

	public void setPeliculaService(PeliculaService peliculaService) {
		this.peliculaService = peliculaService;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
