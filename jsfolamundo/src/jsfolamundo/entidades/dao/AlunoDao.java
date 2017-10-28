package jsfolamundo.entidades.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jsfolamundo.entidades.Aluno;

public class AlunoDao implements CrudDao<Aluno>{
	
	private EntityManager em;
	public AlunoDao(){
		em = EntityManagerSingleton.getInstance();
	}

	@Override
	public void salvar(Aluno objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}
	@Override
	public void atualizar(Aluno objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}

	@Override
	public void excluir(Long id) {
		Aluno objeto = consultar(id);
		em.getTransaction().begin();
		em.remove(objeto);
		em.getTransaction().commit();
	}

	@Override
	public Aluno consultar(Long id) {
		return em.find(Aluno.class, id);
	}

	@Override
	public List<Aluno> listar() {
		Query query = em.createQuery("select c from Aluno c");
		return query.getResultList();
	}

}
