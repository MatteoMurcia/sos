package sos.model.vo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proveedor
 *
 */
@Entity
@Table(name = "PROVEEDOR")
public class Proveedor implements Serializable {

	   
	@Id
	private String cedulap;
	private String nombre;
	private String apellido;
	private String clave;
	private String genero;
	private String telefono;
	private Integer calificacion;
	private String correo;
	private String localidad;
	private String profesion;
	private static final long serialVersionUID = 1L;

	public Proveedor() {
		super();
	}   
	public String getCedulap() {
		return this.cedulap;
	}

	public void setCedulap(String cedulap) {
		this.cedulap = cedulap;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}   
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}   
	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}   
	public Integer getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}   
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}   
	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}   
	public String getProfesion() {
		return this.profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
   
}
