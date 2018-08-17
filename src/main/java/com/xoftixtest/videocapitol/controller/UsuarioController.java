package com.xoftixtest.videocapitol.controller;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Textbox;

import com.xoftixtest.videocapitol.dao.mapper.UsuarioMapper;
import com.xoftixtest.videocapitol.models.Usuario;
import com.xoftixtest.videocapitol.service.UsuarioService;

import org.zkoss.zk.ui.Component;


@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class UsuarioController extends SelectorComposer<Component>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
	private Textbox cedula;
	
	@Wire
	private Textbox nombre;
	
	@Wire
	private Textbox direccion;
	
	@Wire
	private Textbox telefono;
	
	@Wire
	private Textbox username;
	
	@Wire
	private Textbox pass;
	
	private Usuario u;
	
	@Listen("onClick = #registrar")
	public void registrar() {
		u = new Usuario();
		u.setCedula(cedula.getValue());
		u.setNombre(nombre.getValue());
		u.setTelefono(telefono.getValue());
		u.setDireccion(direccion.getValue());
		u.setTipo_user(0);
		u.setUsername(username.getValue());
		u.setPass(pass.getValue());
		this.usuarioService.agregarUsuario(u);
		Clients.showNotification("Usuario registrado!");
	}
	@Listen("onClick = #buscar")
	public void buscar() {
		u = this.usuarioService.buscarUsuario(cedula.getValue());
		nombre.setValue(u.getNombre());
		direccion.setValue(u.getDireccion());
		telefono.setValue(u.getTelefono());
		
	}
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Textbox getCedula() {
		return cedula;
	}

	public void setCedula(Textbox cedula) {
		this.cedula = cedula;
	}

	public Textbox getNombre() {
		return nombre;
	}

	public void setNombre(Textbox nombre) {
		this.nombre = nombre;
	}

	public Textbox getDireccion() {
		return direccion;
	}

	public void setDireccion(Textbox direccion) {
		this.direccion = direccion;
	}

	public Textbox getTelefono() {
		return telefono;
	}

	public void setTelefono(Textbox telefono) {
		this.telefono = telefono;
	}

	public Textbox getUsername() {
		return username;
	}

	public void setUsername(Textbox username) {
		this.username = username;
	}

	public Textbox getPass() {
		return pass;
	}

	public void setPass(Textbox pass) {
		this.pass = pass;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@WireVariable(rewireOnActivate = true)
	private UsuarioService usuarioService;
	
	
	
}
