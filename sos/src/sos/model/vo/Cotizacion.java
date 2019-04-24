package sos.model.vo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cotizacion
 *
 */
@Entity

public class Cotizacion implements Serializable {

	   
	@Id
	private String idcoti;
	private String estado;
	private String estimaciontiempo;
	private String comentario;
	private String idservice;
	private String cedulap;
	private static final long serialVersionUID = 1L;

	public Cotizacion() {
		super();
	}   
	public String getIdcoti() {
		return this.idcoti;
	}

	public void setIdcoti(String idcoti) {
		this.idcoti = idcoti;
	}   
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}   
	public String getEstimaciontiempo() {
		return this.estimaciontiempo;
	}

	public void setEstimaciontiempo(String estimaciontiempo) {
		this.estimaciontiempo = estimaciontiempo;
	}   
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}   
	public String getIdservice() {
		return this.idservice;
	}

	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}   
	public String getCedulap() {
		return this.cedulap;
	}

	public void setCedulap(String cedulap) {
		this.cedulap = cedulap;
	}
   
}
