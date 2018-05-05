/**
 * 
 */
package net.tecgurus.spring.boot.dto;

import java.io.Serializable;

import net.tecgurus.boot.model.Banco;

/**
 * @author root
 *
 */
public class PeticionCrearBanco extends Request implements Serializable{
	private static final long serialVersionUID = -1116476972692857008L;
	private Banco banco;
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}
