package com.xoftixtest.videocapitol.dao.mapper;

import com.xoftixtest.videocapitol.models.Usuario;
import java.util.List;

public interface UsuarioMapper {
	
	public void insertar(Usuario u);
	public Usuario buscar(String cedula);
	public Usuario ingresar(Usuario u);
	public List<Usuario> busquedaParametrizada(Usuario u);
	public List<Usuario> listar();
	public void actualizar(Usuario u);
	public boolean siExiste(String cedula);
}
