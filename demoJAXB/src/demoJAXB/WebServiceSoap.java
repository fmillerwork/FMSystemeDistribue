package demoJAXB;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.localhost:8989/")
public class WebServiceSoap {
	
	@WebMethod(operationName = "multi")
	public @WebResult(name = "résultat") double multiplication(@WebParam(name = "premierFacteur")double a, @WebParam(name = "secondFacteur")double b) {
		 return a * b;
	}
	
	@WebMethod(operationName = "add")
	public @WebResult(name = "résultat") double addition(@WebParam(name = "premierTerme")double a, @WebParam(name = "secondTerme")double b) {
		 return a * b;
	}
	
}
