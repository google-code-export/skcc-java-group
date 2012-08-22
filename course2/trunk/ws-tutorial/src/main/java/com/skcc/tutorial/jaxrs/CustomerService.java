package com.skcc.tutorial.jaxrs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customerservice")
@Produces({"application/xml", "application/json"})
@Consumes({"application/xml", "application/json"})
public class CustomerService {

	@Path("/customer/{id}")
	@GET
	public Customer getCustomer(@PathParam("id") long id){
		return customers.get(id);
	}
	
	@Path("/customer/{id}")
	@PUT
	public void addCustomer(@PathParam("id") long id, Customer customer){
		customers.put(id, customer);
	}
	
	@Path("/customers")
	@GET
	@POST
	public Collection<Customer> getAllCustomers(){
		return customers.values();
	}
	

	private Map<Long, Customer> customers = new HashMap<Long, Customer>();
	
	public void setCustomers(Map<Long, Customer> customers) {
		this.customers = customers;
	}
}
