/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jose.clase12020.resources;

import com.jose.clase1m12020.entity.Computadora;
import com.jose.clasem12020.utilidades.Utilidades;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jose Luis
 */
@Path("sistemas")
public class OperacionesResource {
    @GET
    @Path("/datos")
    public Response hola()
    {
        return Response.ok("Esta en otra Ubicacion").build();
    }
    
    @GET
    @Path("/datos/{idclase}")
    public Response hola(@PathParam(value="ideclase") String id)
    {
        return Response
                .ok("Esta en otra Ubicacion")
                .build();
    }
    @GET
    @Path("/saludo")
    public Response saludo()
    {
        Utilidades utilidades=new Utilidades();
        Computadora computadora=new Computadora("45893");
        String valor=utilidades.saluda();
        return Response.ok(valor).build();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/computadora")
    public Computadora devolverComputadora()
    {
        Computadora computador= new Computadora("3555ad","HP","Panama 2020","AMD",225.5,5);
        return computador;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/computadoradefault")
    public Computadora devolverComputadoraDefault()
    {
        return new Computadora("0004555557","HP","Panama 2020","AMD",225.5,8);
    }
    
   
    @GET
    @Path("message")
    @Produces(MediaType.TEXT_PLAIN)
    public String securedMethod()
    {
        return "This API needs login";
    }
    
}

