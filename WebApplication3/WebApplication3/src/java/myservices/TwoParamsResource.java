
package myservices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
@Path("twoParams")
public class TwoParamsResource {

		@Context
		private UriInfo context;

		/**
		 * Creates a new instance of TwoParamsResource
		 */
		public TwoParamsResource() {
		}
	@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("users")
		public String getAllUsers() {
			JSONParser parser = new JSONParser();
			Object objj = null;
			try {   
				objj = parser.parse(new FileReader("C:\\Users\\M-N\\Downloads\\NetBeansProjects\\WebApplication3\\WebApplication3\\src\\java\\myservices\\twiter.json"));
				JSONObject jsonObject = (JSONObject) objj;
				JSONObject obj1 = new JSONObject();
				JSONObject obj2 = new JSONObject();
				JSONArray obj=  new JSONArray();
				obj=(JSONArray) jsonObject.get("twitter");
				JSONArray output = new JSONArray();
				for(int i=0;i<obj.size();i++){
					obj1=(JSONObject) obj.get(i);
					//obj2 = (JSONObject) obj1.get("user");
					//output.add(obj1.get("text"));
					//output.add(obj1.get("created_at"));
					output.add(obj1.get("user"));
				}
				if(!jsonObject.isEmpty()){
					return output.toString();
				}
				/*
				JSONObject jsonObject = (JSONObject) objj;
				JSONArray jsonChildObject = (JSONArray) jsonObject.get("user");

			   for(int i=0;i<jsonChildObject.size();i++){

			   if(((JSONObject)jsonChildObject.get(i)).get("id").toString().equals("2244994945")){
				  return ((JSONObject)jsonChildObject.get(i)).toString(); 
			   }*/
			}catch(Exception ex){
		return ex.getMessage();
		
	}
			 return "0"; 
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("Tweets")
		public String getAllTweets() {
			JSONParser parser = new JSONParser();
			Object objj = null;
			try {   
				objj = parser.parse(new FileReader("C:\\Users\\M-N\\Downloads\\NetBeansProjects\\WebApplication3\\WebApplication3\\src\\java\\myservices\\twiter.json"));
				JSONObject jsonObject = (JSONObject) objj;
				JSONObject obj1 = new JSONObject();
				JSONObject obj2 = new JSONObject();
				JSONArray obj=  new JSONArray();
				obj=(JSONArray) jsonObject.get("twitter");
				JSONArray output = new JSONArray();
				for(int i=0;i<obj.size();i++){
					obj1=(JSONObject) obj.get(i);
					obj2 = (JSONObject) obj1.get("user");
					output.add(obj1.get("text"));
					output.add(obj1.get("created_at"));
					output.add(obj2.get("id"));
				}
				if(!jsonObject.isEmpty()){
					return output.toString();
				}
				/*
				JSONObject jsonObject = (JSONObject) objj;
				JSONArray jsonChildObject = (JSONArray) jsonObject.get("user");

			   for(int i=0;i<jsonChildObject.size();i++){

			   if(((JSONObject)jsonChildObject.get(i)).get("id").toString().equals("2244994945")){
				  return ((JSONObject)jsonChildObject.get(i)).toString(); 
			   }*/
			}catch(Exception ex){
		return ex.getMessage();
		
	}
			 return "0"; 
		}
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("id")
		  public String getbyid() {
			JSONParser parser = new JSONParser();
			Object objj = null;
			
			try {   
				objj = parser.parse(new FileReader("C:\\Users\\M-N\\Downloads\\NetBeansProjects\\WebApplication3\\WebApplication3\\src\\java\\myservices\\twiter.json"));
				JSONObject jsonObject = (JSONObject) objj;
				JSONObject obj1 = new JSONObject();
				JSONObject obj2 = new JSONObject();
				JSONArray obj=  new JSONArray();
				obj=(JSONArray) jsonObject.get("twitter");
				JSONArray output = new JSONArray();
				for(int i=0;i<obj.size();i++){
				   obj1=(JSONObject) obj.get(i);
					obj2 = (JSONObject) obj1.get("user");
					
					if(obj2.get("id").toString().equals("4")){
					
					obj2.get("name");
					
					output.add(obj2.get("name"));
				
				//if(!jsonObject.isEmpty()){
					
				return obj2.toString();}}
				/*
				JSONObject jsonObject = (JSONObject) objj;
				JSONArray jsonChildObject = (JSONArray) jsonObject.get("user");

			   for(int i=0;i<jsonChildObject.size();i++){

			   if(((JSONObject)jsonChildObject.get(i)).get("id").toString().equals("2244994945")){
				  return ((JSONObject)jsonChildObject.get(i)).toString(); 
			   }*/
			}catch(Exception ex){
		return ex.getMessage();
		
	}
			 return "0"; 
		}
		 @GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("{name}")
		  public String getbyname(@PathParam("name") String name) {
			JSONParser parser = new JSONParser();
			Object objj = null;
			 JSONObject jsonObject5 = new JSONObject();
			jsonObject5.put("thename", name);
			try {   
				objj = parser.parse(new FileReader("C:\\Users\\M-N\\Downloads\\NetBeansProjects\\WebApplication3\\WebApplication3\\src\\java\\myservices\\twiter.json"));
				JSONObject jsonObject = (JSONObject) objj;
				JSONObject obj1 = new JSONObject();
				JSONObject obj2 = new JSONObject();
				JSONArray obj=  new JSONArray();
				obj=(JSONArray) jsonObject.get("twitter");
				JSONArray output = new JSONArray();
				for(int i=0;i<obj.size();i++){
				   obj1=(JSONObject) obj.get(i);
					obj2 = (JSONObject) obj1.get("user");
					
					if(obj2.get("screen_name").toString().equals(name)){
					
					obj2.get("name");
					obj2.get("location");
					obj2.get("url");
					obj2.get("description");
					output.add(obj2.get("name"));
					output.add(obj2.get("location"));
					output.add(obj2.get("url"));
					output.add(obj2.get("description"));
				
				//if(!jsonObject.isEmpty()){
					
				return output.toString();}}
				/*
				JSONObject jsonObject = (JSONObject) objj;
				JSONArray jsonChildObject = (JSONArray) jsonObject.get("user");

			   for(int i=0;i<jsonChildObject.size();i++){

			   if(((JSONObject)jsonChildObject.get(i)).get("id").toString().equals("2244994945")){
				  return ((JSONObject)jsonChildObject.get(i)).toString(); 
			   }*/
			}catch(Exception ex){
		return ex.getMessage();
		
	}
			 return "0"; 
		}
	   
	   /* @GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("{id}/{date}")
		public String getJson(@PathParam("id") String id,
				@PathParam("date") String date) throws JSONException {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("the_id", id);
			jsonObject.put("the_date", date);
			return jsonObject.toString();
		}*/

		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		public void putJson(String content) {
		}
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 
package myservices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@Path("twoParams")
public class TwoParamsResource {

    @Context
    private UriInfo context;


    public TwoParamsResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test2")
    public String test2() {

        JSONParser parser = new JSONParser();
        Object objj = null;
        try {

            objj = parser.parse(new FileReader("C:\\Users\\M-N\\Documents\\NetBeansProjects\\WebApplication3\\src\\java\\myservices\\newjson.json"));
            JSONObject jsonObject = (JSONObject) objj;
            JSONArray jsonChildObject = (JSONArray) jsonObject.get("user");
            
           for(int i=0;i<jsonChildObject.size();i++){
           
           if(((JSONObject)jsonChildObject.get(i)).get("id").toString().equals("2244994945")){
              return ((JSONObject)jsonChildObject.get(i)).toString(); 
           }
           }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(TwoParamsResource.class.getName()).log(Level.SEVERE, null, ex);
           return ex.getMessage();

        } catch (ParseException ex) {
            Logger.getLogger(TwoParamsResource.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
        catch(Exception ex){
    return ex.getMessage();
    
}

        return "o";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test")
    public String test() {
        try {
            JSONParser parser = new JSONParser();
            Object objj = parser.parse(new FileReader("C:\\Users\\M-N\\Documents\\NetBeansProjects\\WebApplication3\\src\\java\\myservices\\newjson.json"));
            JSONObject jsonObject = (JSONObject) objj;
            //return jsonObject.get("text").toString();
            return jsonObject.toString();
        } catch (IOException ex) {
            Logger.getLogger(TwoParamsResource.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        } catch (ParseException ex) {
            Logger.getLogger(TwoParamsResource.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }

    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/{date}")
    public String getJson(@PathParam("id") String id,
            @PathParam("date") String date) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("the_id", id);
        jsonObject.put("the_date", date);
        return jsonObject.toString();
    }

     
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
*/