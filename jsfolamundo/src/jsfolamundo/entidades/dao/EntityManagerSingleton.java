package jsfolamundo.entidades.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerSingleton {
	private static EntityManager em;

	private EntityManagerSingleton() {
	}

	public static EntityManager getInstance() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory("provider-ucb").createEntityManager();
		}

		return em;

	}

}
