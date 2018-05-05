package net.tecgurus.spring.boot.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.boot.model.Banco;
import net.tecgurus.boot.repository.BancoRepository;
import net.tecgurus.spring.boot.dto.PeticionConsulta;
import net.tecgurus.spring.boot.dto.PeticionCrearBanco;
import net.tecgurus.spring.boot.dto.RespuestaConsulta;

@RestController
public class OperacionesControl {
	
	
	@Autowired
	private BancoRepository bancoRepository;
	
	/*
	 * CRUD  Banco
	 * */
	
	@RequestMapping(value = "/banco/ingresar", method = RequestMethod.POST)
	public boolean ingresaBanco(@RequestBody PeticionCrearBanco peticion) {
		Banco b =  bancoRepository.save(peticion.getBanco());
		return b!=null;
	}
	
	@RequestMapping("/hola2")
	public String hola() {
		return "Ola k hace?..."; 	
	}
	@RequestMapping (value = "/consulta/usuario", method = RequestMethod.POST)
	public RespuestaConsulta consultaUsuario(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Nombre:: " + peticion.getOperacion());
		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("100000");
		resp.setNombre("Fidelmar");
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken("Mitoken");
		return resp;
	}
	
	
	
	@RequestMapping (value = "/consulta/usuario/alternativo", method = RequestMethod.POST)
	public @ResponseBody RespuestaConsulta consultaUsuarioAlternativo(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Nombre:: " + peticion.getOperacion());
		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("100000");
		resp.setNombre("Fidelmar");
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken("Mitoken");
		return resp;
	}
	
	@RequestMapping(value = "/actualiza/usuario", method = RequestMethod.PUT)
	public RespuestaConsulta updateUsuario(@RequestBody PeticionConsulta peticion) {
		System.out.println("Nombre:: " + peticion.getNombre());
		System.out.println("Operacion:: " + peticion.getOperacion());
		
		RespuestaConsulta resp = new RespuestaConsulta();
		resp.setCodigo("00");
		resp.setCodigo_descripcion("OK");
		resp.setId("10001");
		resp.setNombre(peticion.getNombre());
		resp.setApellido("Cruz");
		resp.setEdad(28);
		resp.setToken(peticion.getToken());
		
		return resp;
	}
	
	@RequestMapping(value = "/elimina/usuario", method = RequestMethod.GET)
	public @ResponseBody boolean eliminarUsuario(@RequestParam("id") String idUsuario) {
		System.out.println("idUsuario:: " + idUsuario);
		return true;
	}
}
