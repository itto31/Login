package com.alvaro.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb1_historialusuarios database table.
 * 
 */
@Entity
@Table(name="tb1_historialusuarios")
@NamedQuery(name="Tb1Historialusuario.findAll", query="SELECT t FROM Tb1Historialusuario t")
public class Tb1Historialusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idHistoria;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to TbUsuario
	@ManyToOne
	@JoinColumn(name="UsuarioId")
	private TbUsuario tbUsuario;

	public Tb1Historialusuario() {
	}

	public int getIdHistoria() {
		return this.idHistoria;
	}

	public void setIdHistoria(int idHistoria) {
		this.idHistoria = idHistoria;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TbUsuario getTbUsuario() {
		return this.tbUsuario;
	}

	public void setTbUsuario(TbUsuario tbUsuario) {
		this.tbUsuario = tbUsuario;
	}

}