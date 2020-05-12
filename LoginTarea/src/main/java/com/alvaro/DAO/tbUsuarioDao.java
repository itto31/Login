package com.alvaro.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alvaro.modelo.TbUsuario;



public class tbUsuarioDao {
	public List<TbUsuario> ListaUsuarios(TbUsuario usu) {
		List<TbUsuario> lisusu = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("LoginTarea");
		em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			lisusu = em.createQuery("from TbUsuario as t where t.usuario = '"+usu.getUsuario()+"'and t.contrasena='"+usu.getContrasena()+"' ").getResultList();		
			em.getTransaction().commit();
			for(TbUsuario datosid:lisusu) {
				usu.setIdUsuario(datosid.getIdUsuario());
				
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e + " Error");
		}
		
		
		return lisusu;
	}
}
