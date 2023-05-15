package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.details;

public class Detailsdao {
	EntityManagerFactory E = Persistence.createEntityManagerFactory("dev");
	EntityManager m = E.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public void save(details details) {
		t.begin();
		m.persist(details);
		t.commit();
	}

	public List<details> Fetchall() {
		return m.createQuery("select a from details a").getResultList();
	}

	public details find(int id) {
		return m.find(details.class, id);
	}
}
