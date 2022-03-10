/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.oscar.rest.recursos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/suma")
public class Suma {
    @GET
    public String getRespuesta(@QueryParam("num1") int n1, @QueryParam("num2") int n2){
        
        return String.valueOf(n2 + n1);
    }
}
