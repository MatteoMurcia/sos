package sos.model.vo;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Servicio
 *
 */
@Entity
@Table(name = "SERVICIOS")
public class Servicio implements Serializable {

	
	private String nombres;   
	@Id
	private String idservice;
	private String descripcion;
	private Date fecha;
	private String cedulac;
	private static final long serialVersionUID = 1L;

	public Servicio() {
		super();
	}   
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}   
	public String getIdservice() {
		return this.idservice;
	}

	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}   
	public String getCedulac() {
		return this.cedulac;
	}

	public void setCedulac(String cedulac) {
		this.cedulac = cedulac;
	}
   
}
