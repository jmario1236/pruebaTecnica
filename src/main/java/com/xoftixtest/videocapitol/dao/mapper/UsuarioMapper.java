package com.xoftixtest.videocapitol.dao.mapper;

import com.xoftixtest.videocapitol.models.Usuario;

public interface UsuarioMapper {
	
	public void insertar(Usuario u);
	public Usuario buscar(String cedula);

}
