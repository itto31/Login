package com.alvaro.DAO;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Object> historial(){
		List<Object> HISTO = new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("LoginTarea");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			HISTO = em.createQuery("SELECT his.idHistoria, his.tbUsuario.idUsuario, his.fecha,"
					+ " usu.nombre_Usuario, usu. apellido_usuario"
					+ "FROM Tb1Historialusuario AS his "
					+ "INNER JOIN  TbUsuario AS usu ON usu.idUsuario = his.tbUsuario.idUsuario").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		
		return HISTO;
	}
}
