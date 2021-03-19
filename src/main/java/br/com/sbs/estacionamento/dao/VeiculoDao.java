package br.com.sbs.estacionamento.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.sbs.estacionamento.entities.Veiculo;

@Repository
public interface VeiculoDao {

	List<Veiculo> lista();

	Veiculo adiciona(Veiculo veiculo);

}
