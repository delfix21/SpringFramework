/**
 * 
 */
package net.tecgurus.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.tecgurus.boot.model.Banco;

/**
 * @author root
 *
 */
// <Identida, ID que tiene el Objeto>
@Repository
public interface BancoRepository extends CrudRepository<Banco, Long>{
	
}
