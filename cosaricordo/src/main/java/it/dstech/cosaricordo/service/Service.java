package it.dstech.cosaricordo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import it.dstech.cosaricordo.model.Persona;





public class Service {
	private EntityManager em;

	public Service(EntityManagerFactory emf) {
		this.em = emf.createEntityManager();
	}
	public Persona aggiungiPersona(Persona persona) {
		em.getTransaction().begin();
		em.persist(persona);
		em.getTransaction().commit();
		return  persona;
	}
	
	public Persona trovaUtente(Persona persona) {
		return em.find(Persona.class, persona.getId());
	}
	public List<Persona> stampaLista() {
		 return  em.createQuery("SELECT persona FROM Persona persona ", Persona.class).getResultList();
		

	}
}
