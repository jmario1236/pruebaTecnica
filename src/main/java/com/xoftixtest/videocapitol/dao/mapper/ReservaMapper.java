package com.xoftixtest.videocapitol.dao.mapper;

import java.util.List;

import com.xoftixtest.videocapitol.models.Reserva;
import com.xoftixtest.videocapitol.models.Usuario;

public interface ReservaMapper {
	public void insertar(Reserva r);
	public List<Reserva> listar();
	public void actualizar(Reserva r);
	public List<Reserva> listarPorUsuario(Usuario u);
}
