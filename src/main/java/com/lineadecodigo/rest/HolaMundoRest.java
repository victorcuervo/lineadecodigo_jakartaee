package com.lineadecodigo.rest;

/**
 * @file HolaMundoRest.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/oct/2015
 * @url    http://lineadecodigo.com/java/hola-mundo-con-jax-rs/
 * @description Ejemplo para crear un servicio RESTful mediante JAX-RS  
 */

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("holamundo")
public class HolaMundoRest {
	
	public HolaMundoRest() {
    }
	
	@GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hola Mundo!!</h1></body></html>";
    }

}
