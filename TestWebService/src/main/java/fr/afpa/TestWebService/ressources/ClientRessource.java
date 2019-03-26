/**
 * 
 */
package fr.afpa.TestWebService.ressources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import fr.afpa.TestWebService.model.Client;
import fr.afpa.TestWebService.services.ClientService;

/**
 * @version 1.0
 * @date 	26 mars 2019
 * @author 	nico
 *
 */

@Path("/clients")
public class ClientRessource {
	
	ClientService clientService = new ClientService();
	
	//Client client = new Client("Sherlock", "Holmes");
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)	
    public List<Client> getClients() {
        return clientService.getClients();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Client findClient(@PathParam("id") long id) {
		return clientService.findById(id);
    	
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Client addClient(Client client) {
		return clientService.addClient(client);
    	
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Client updateClient(@PathParam("id") long id, Client client) {
		return clientService.updateClient(client);
    	
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public List<Client> deleteClient(@PathParam("id") long id) {
    	return clientService.deleteClient(id);
    	
    }
    
    // methode finByName
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/name")
    public List<Client> findByName(@QueryParam("name") String name) {
    	return clientService.findByName(name);
    	
    }

    
    
    
    
/*    @GET
    @Produces(MediaType.TEXT_PLAIN)	//text_plain attend un String, pas d'objet
    public String getName() {
        return client.getName();
    }*/
}
