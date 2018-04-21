package net.tecgurus.spring.boot.ctrls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionesControl {
	@RequestMapping("/hola2")
	public String hola() {
		return "Ola k hace?..."; 	
	}
}
