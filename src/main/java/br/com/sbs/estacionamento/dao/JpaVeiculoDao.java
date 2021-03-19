package br.com.sbs.estacionamento.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.sbs.estacionamento.entities.Veiculo;

@Repository
public class JpaVeiculoDao implements VeiculoDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Veiculo> lista() {
		return manager.createQuery("select t from Veiculo t").getResultList();
	}

	@Override
	public Veiculo adiciona(Veiculo veiculo) {
		return manager.persist(veiculo);

	}

}
