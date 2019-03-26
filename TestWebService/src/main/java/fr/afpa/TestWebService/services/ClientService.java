/**
 * 
 */
package fr.afpa.TestWebService.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.afpa.TestWebService.dataBase.DataBase;
import fr.afpa.TestWebService.model.Client;

/**
 * @version 1.0
 * @date 	26 mars 2019
 * @author 	nico
 *
 */
public class ClientService {
	
	private Map<Long, Client> clients = DataBase.getClients();
	
	public ClientService() {
		clients.put(1L, new Client(1,"Holmes","Sherlock"));
		clients.put(2L, new Client(2,"Watson","Docteur"));
		clients.put(3L, new Client(3,"Moriartry","Méchant"));
		clients.put(4L, new Client(4,"Holmes","Betty"));
		
		
	}
	
	
	public List<Client> getClients() {
	
		return new ArrayList<Client>(clients.values());
		
	}
	
	public Client findById(long id) {
		
		return clients.get(id);
		
	}
	
	public Client addClient(Client client) {
		// on ajoute un nouveau client à notre liste
		client.setId(clients.size() + 1 );
		
		//On l'ajoute à notre collection hashmap
		clients.put(client.getId(), client);
		
		return client;
		
	}
	
	public Client updateClient(Client client) {
		
		if (client.getId()<=0) {
			return null;
		}
		
		clients.put(client.getId(), client);
		
		return client;
			
		
	}
	
	public List<Client> deleteClient(long id) {
		System.out.println("in delete method avant remove" + id + " - " + clients.size());
		clients.remove(id);
		System.out.println("in delete method après remove " + id + " - " + clients.size());
		return new ArrayList<Client>(clients.values());
		
		
	}

	/**
	 * methode pour chercher les clients par leur nom
	 * 
	 */
	
	public List<Client> findByName(String name) {
		List<Client> listeClient = new ArrayList<Client>();
		for(Client client : clients.values()) {
			
			// si le nom du client = nom passé en param => on l'ajoute dans la liste client de retour
			if (client.getName().equals(name)) {
				listeClient.add(client);
				
			}
		}
		System.out.println("liste client by name : " + listeClient.size());
		return listeClient;
		
	}
}
