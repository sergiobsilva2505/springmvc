package br.com.sbs.estacionamento.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sbs.estacionamento.entities.Veiculo;

@Repository
public class VeiculoDaoImpl implements VeiculoDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Veiculo> lista() {
		return manager.createQuery("select t from Veiculo t").getResultList();
	}

	@Transactional
	@Override
	public void adiciona(Veiculo veiculo) {
		manager.persist(veiculo);

	}

}
