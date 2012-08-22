package com.skcc.tutorial.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Hello {

	@WebMethod(operationName="SayHello")
	public abstract String sayHello(String name);

	public abstract String sayBye(String name);
}