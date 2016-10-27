package br.com.compracerta.plataforma.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.compracerta.plataforma.entities.Conta;

@Repository
public class ContaRepository {

	@PersistenceContext
	private EntityManager	manager;

	public List<Conta> findAll() {
		return manager.createQuery("select c from Conta c", Conta.class).getResultList();
	}

	public Conta findById(Long id) {
		return manager.createQuery("select * from Conta c where c.id = :id", Conta.class).setParameter("id", id).getSingleResult();
	}

	@Transactional
	public void save(Conta conta) {
		manager.merge(conta);
	}
}
