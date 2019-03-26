/**
 * 
 */
package fr.afpa.TestWebService.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @date 25 mars 2019
 * @author nico
 *
 */

//@XmlRootElement
public class Client {

	
	

	/**
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * @param name
	 * @param firstName
	 */
	public Client(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}

	private long id;
	
	private String name;

	private String firstName;

	
	
	/**
	 * @param id
	 * @param name
	 * @param firstName
	 */
	public Client(long id, String name, String firstName) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [name=" + name + ", firstName=" + firstName + "]";
	}

}
