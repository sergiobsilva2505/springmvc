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

	@SuppressWarnings("unchecked")
	@Override
	public List<Veiculo> lista() {
		 return manager.createQuery("select t from Veiculo t").getResultList();
	}

	@Override
	public void adiciona(Veiculo veiculo) {
		// TODO Auto-generated method stub
		manager.persist(veiculo);
		
	}

}
