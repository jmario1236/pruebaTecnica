package com.xoftixtest.videocapitol.service;

import com.xoftixtest.videocapitol.models.Usuario;

public interface UsuarioService {
	public void agregarUsuario(Usuario u);
	public Usuario buscarUsuario(String cedula);
}
