package br.com.sbs.estacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sbs.estacionamento.dao.VeiculoDao;
import br.com.sbs.estacionamento.entities.Veiculo;


@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoDao dao;

	public List<Veiculo> findAll(){
		List<Veiculo> lista = dao.lista();
		return lista;
	}

	public Veiculo adiciona(Veiculo veiculo) {
		Veiculo obj = dao.adiciona(veiculo);
		return obj;
	}

}
