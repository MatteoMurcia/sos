package sos.model.vo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Materiales
 *
 */
@Entity
@Table(name = "MATERIALES")
public class Materiales implements Serializable {

	   
	@Id
	private String idmaterial;
	private String material;
	private String cantidad;
	private Integer valor;
	private String cedulac;
	private String idcoti;
	private static final long serialVersionUID = 1L;

	public Materiales() {
		super();
	}   
	public String getIdmaterial() {
		return this.idmaterial;
	}

	public void setIdmaterial(String idmaterial) {
		this.idmaterial = idmaterial;
	}   
	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}   
	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}   
	public Integer getValor() {
		return this.valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}   
	public String getCedulac() {
		return this.cedulac;
	}

	public void setCedulac(String cedulac) {
		this.cedulac = cedulac;
	}   
	public String getIdcoti() {
		return this.idcoti;
	}

	public void setIdcoti(String idcoti) {
		this.idcoti = idcoti;
	}
   
}
