package com.xoftixtest.videocapitol.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xoftixtest.videocapitol.dao.mapper.ReservaMapper;
import com.xoftixtest.videocapitol.models.Reserva;
import com.xoftixtest.videocapitol.models.Usuario;
import com.xoftixtest.videocapitol.service.ReservaService;


@Service("reservaService")
public class ReservaServiceImpl implements ReservaService {
	
	@Resource
	private ReservaMapper reservaMapper;

	public void reservarPelicula(Reserva r) {
		// TODO Auto-generated method stub
		this.reservaMapper.insertar(r);
	}

	public List<Reserva> listarReservas() {
		// TODO Auto-generated method stub
		return this.reservaMapper.listar();
	}

	public void actualizarReservas(Reserva r) {
		// TODO Auto-generated method stub
		this.reservaMapper.actualizar(r);
	}

	public List<Reserva> listarReservasPorUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return this.reservaMapper.listarPorUsuario(u);
	}

}
