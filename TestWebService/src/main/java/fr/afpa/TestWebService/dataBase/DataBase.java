/**
 * 
 */
package fr.afpa.TestWebService.dataBase;

import java.util.HashMap;
import java.util.Map;

import fr.afpa.TestWebService.model.Client;

/**
 * @version 1.0
 * @date 	26 mars 2019
 * @author 	nico
 *
 */
public class DataBase {
	
	private static Map<Long, Client> clients = new HashMap<Long, Client>();

	/**
	 * @return the clients
	 */
	public static Map<Long, Client> getClients() {
		return clients;
	}
	
	
	

}
