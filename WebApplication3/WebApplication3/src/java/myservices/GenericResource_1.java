/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import javax.ws.rs.PathParam;
import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * REST Web Service
 *
 * @author M-N
 */
@Path("generic")
public class GenericResource_1 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource_1
     */
    public GenericResource_1() {
    }

    /**
     * Retrieves representation of an instance of myservices.GenericResource_1
     * @return an instance of java.lang.String
     */
     @GET
    @Produces(MediaType.APPLICATION_JSON)
  @Path("{id}/{date}")
    public String getJson(@PathParam("id") String id,
                          @PathParam("date") String date) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        id="k";
        date="ll";
        
        JSONObject.getNames(id);
        return jsonObject.toString();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource_1
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
