package com.xoftixtest.videocapitol.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Include;


public class InicioController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	private Include frameCentral;
	
	@Wire
	private Button navRegistro;
	
	@Wire
	private Button login;
	
	@Listen("onClick = #login")
	public void navegarLogin() {
		frameCentral.setSrc("login.zul");
	}
	
	@Listen("onClick = #navRegistro")
	public void navegarRegistro() {
		frameCentral.setSrc("registrarUsuario.zul");
	}
	
	
}
