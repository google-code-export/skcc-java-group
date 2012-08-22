package com.skcc.tutorial.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@WebService(endpointInterface="com.skcc.tutorial.jaxws.Hello")
@Path("{name}")
public class HelloImpl implements Hello {

	@Override
	@WebMethod
	public String sayHello(@PathParam("name") String name){
		return "Hello, "+name+".";
	}

	@Override
	public String sayBye(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Produces("application/json")
	@GET
	public Salute sayInJason(@PathParam("name") String name){
		return new Salute("hello, ", name);
	}
	@Produces("application/xml")
	@GET
	public Salute say(@PathParam("name") String name){
		return new Salute("hello, ", name);
	}
}
