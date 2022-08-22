package com.exemplojpa.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exemplojpa.cliente.model.Cliente;

public class ClienteDAO {
	
	
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpaPU");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public Cliente obterCliente(int id) {
		EntityManager em = getEntityManager();
		Cliente cliente = em.find(Cliente.class, id);
		em.close();	
		return cliente;	
	}
	
	public void inserirCliente(Cliente cliente) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		System.out.println(cliente.getNome()+" inserido com sucesso!");
	}
	
	public void removerCliente(int id) {
		EntityManager em = getEntityManager();
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
		System.out.println(cliente.getNome()+" removido com sucesso!");
	}
	
	public void atualizarCliente(Cliente cliente) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
		System.out.println(cliente.getNome()+" atualizado com sucesso!");
	}
	

}
