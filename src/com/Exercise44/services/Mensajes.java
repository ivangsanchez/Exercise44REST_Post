package com.Exercise44.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/msgs")
public class Mensajes {
	
	@POST
	public String diHola() {
		
		return "Hola Mundo desde el POST";
	}
	
	@GET
	public String diHola2() {
		return "Hola mundo desde el GET";
	}

}
