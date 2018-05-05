/**
 * 
 */
package net.tecgurus.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author root
 *
 */
@Entity
public class Banco {
	@Id
	private int idBanco;
	private String nombre;
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
