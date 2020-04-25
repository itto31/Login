package com.alvaro.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_usuarios database table.
 * 
 */
@Entity
@Table(name="tb_usuarios")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String apellido_usuario;

	private String contrasena;

	private String nombre_Usuario;

	private String usuario;

	//bi-directional many-to-one association to Tb1Historialusuario
	@OneToMany(mappedBy="tbUsuario")
	private List<Tb1Historialusuario> tb1Historialusuarios;

	public TbUsuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellido_usuario() {
		return this.apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre_Usuario() {
		return this.nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<Tb1Historialusuario> getTb1Historialusuarios() {
		return this.tb1Historialusuarios;
	}

	public void setTb1Historialusuarios(List<Tb1Historialusuario> tb1Historialusuarios) {
		this.tb1Historialusuarios = tb1Historialusuarios;
	}

	public Tb1Historialusuario addTb1Historialusuario(Tb1Historialusuario tb1Historialusuario) {
		getTb1Historialusuarios().add(tb1Historialusuario);
		tb1Historialusuario.setTbUsuario(this);

		return tb1Historialusuario;
	}

	public Tb1Historialusuario removeTb1Historialusuario(Tb1Historialusuario tb1Historialusuario) {
		getTb1Historialusuarios().remove(tb1Historialusuario);
		tb1Historialusuario.setTbUsuario(null);

		return tb1Historialusuario;
	}

}