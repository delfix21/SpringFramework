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
public class Perfil {
	@Id
	private int idPerfil;
	private String nombre;
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
