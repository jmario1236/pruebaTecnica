package com.xoftixtest.videocapitol.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xoftixtest.videocapitol.dao.mapper.UsuarioMapper;
import com.xoftixtest.videocapitol.models.Usuario;
import com.xoftixtest.videocapitol.service.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Resource
	private UsuarioMapper usuarioMapper;

	public void agregarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.usuarioMapper.insertar(u);
	}

	public Usuario buscarUsuario(String cedula) {
		// TODO Auto-generated method stub
		return this.usuarioMapper.buscar(cedula);
	}

	public Usuario ingresar(Usuario u) {
		// TODO Auto-generated method stub
		return this.usuarioMapper.ingresar(u);
	}

	public List<Usuario> busquedaUsuarioParametrizada(Usuario u) {
		// TODO Auto-generated method stub
		return this.usuarioMapper.busquedaParametrizada(u);
	}

	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return this.usuarioMapper.listar();
	}

	public void actualizarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.usuarioMapper.actualizar(u);
	}

	public boolean siExisteUsuario(String cedula) {
		// TODO Auto-generated method stub
		return this.usuarioMapper.siExiste(cedula);
	}

}
