/**
 * 
 */
package fr.afpa.TestWebService.ressources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @version 1.0
 * @date 	25 mars 2019
 * @author 	nico
 *
 */

@Path("hello")
public class HelloRessource {
	

	// methode 1 : avec pathparam
    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)	//text_plain attend un String, pas d'objet
    public String getHello(@PathParam("name") String name) {
  
        return "Hello " + name;
    }
    
    // methode 2 : queryparam
    
    @GET
    @Path("/query")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello2(@QueryParam("name") String name) {
        return "Hello " + name;
        
        // http://localhost:8080/TestWebService/webapi/hello/query?name=jovan
    }
    
    
    
    
    
   

}
