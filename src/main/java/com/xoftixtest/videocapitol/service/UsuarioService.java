package com.xoftixtest.videocapitol.service;

import java.util.List;

import com.xoftixtest.videocapitol.models.Usuario;

public interface UsuarioService {
	public void agregarUsuario(Usuario u);
	public Usuario buscarUsuario(String cedula);
	public Usuario ingresar(Usuario u);
	public List<Usuario> busquedaUsuarioParametrizada(Usuario u);
	public List<Usuario> listarUsuarios();
	public void actualizarUsuario(Usuario u);
	public boolean siExisteUsuario(String cedula);
}
