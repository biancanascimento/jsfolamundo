package jsfolamundo.entidades.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jsfolamundo.entidades.Contato;

public class ContatoDao implements CrudDao<Contato>{
	
	public EntityManager em;
	public ContatoDao(){
		em = EntityManagerSingleton.getInstance();
	}

	@Override
	public void salvar(Contato objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}

	@Override
	public void atualizar(Contato objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}

	@Override
	public void excluir(Long id) {
		Contato objeto = consultar(id);
		em.getTransaction().begin();
		em.remove(objeto);
		em.getTransaction().commit();
	}

	@Override
	public Contato consultar(Long id) {
		return em.find(Contato.class, id);
	}

	@Override
	public List<Contato> listar() {
		Query query = em.createQuery("select c from Contato C");
		return query.getResultList();
	}

}
