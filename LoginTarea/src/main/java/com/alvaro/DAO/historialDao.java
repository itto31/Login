package com.alvaro.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alvaro.modelo.Tb1Historialusuario;

public class historialDao {
		public void agregarDatosHistorial(Tb1Historialusuario his) {
			EntityManager em;
			EntityManagerFactory emf;
			emf= Persistence.createEntityManagerFactory("LoginTarea");
			em = emf.createEntityManager();
			em.getTransaction().begin();
	    	em.persist(his);
			em.flush();
			em.getTransaction().commit();
		}
		
}
