package com.xoftixtest.videocapitol.service;

import java.util.List;

import com.xoftixtest.videocapitol.models.Reserva;
import com.xoftixtest.videocapitol.models.Usuario;

public interface ReservaService {
	public void reservarPelicula(Reserva r);
	public List<Reserva> listarReservas();
	public void actualizarReservas(Reserva r);
	public List<Reserva> listarReservasPorUsuario(Usuario u);
}
