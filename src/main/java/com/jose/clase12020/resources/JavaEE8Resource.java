package com.jose.clase12020.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("javaee8")
public class JavaEE8Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    @GET
    @Path("/noches")
    public Response hola()
    {
        return Response.ok("buenas noches").build();
    }
    @GET
    @Path("/dias")
    public Response buenosDias()
    {
        return Response.ok("buenos dias").build();
    }
    @GET
    @Path("/dias/{nombre}")
    public Response buenosDias(@PathParam("nombre") String nombre)
    {
        return Response.ok("buenos dias, "+nombre).build();
    }
    @GET
    @Path("/Calculo/{valor}")
    public Response calculo(@PathParam("valor") String valor)
    {
        int a=Integer.parseInt(valor)+10;
        return Response.ok("el valor mas 10 seira, "+a).build();
    }
}
