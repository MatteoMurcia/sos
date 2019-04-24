package sos.model.vo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Listaenviados
 *
 */
@Entity

public class Listaenviados implements Serializable {

	   
	@Id
	private Integer id;
	private String idservice;
	private String cedulap;
	private static final long serialVersionUID = 1L;

	public Listaenviados() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
