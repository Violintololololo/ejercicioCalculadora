package org.oscar.rest.recursos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;


@Path("/multiplicacion")
public class operacionesCalculadora {
    @GET
    public String getRespuesta(@QueryParam("num1") int n1, @QueryParam("num2") int n2){
        
        return String.valueOf(n2 * n1);
    }
}
