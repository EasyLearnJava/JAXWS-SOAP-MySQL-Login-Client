package com.easylearnjava.consumer.web;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.easylearnjava.consumer.webservice.jaxws.LoginInterface;
import com.easylearnjava.consumer.webservice.jaxws.User;
import com.easylearnjava.consumer.webservice.jaxws.UserWrapper;

public class Test {
	
	private static final String WS_URL = "http://localhost:8080/JAXWS-SOAP-MySQL-Login/login?wsdl";
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL(WS_URL);
		QName qname = new QName("http://webservice.provider.easylearnjava.com/",	"LoginImplementationService");
		Service service = Service.create(url, qname);
		
		LoginInterface lInterface = service.getPort(LoginInterface.class);
		
		UserWrapper userWrapper = (UserWrapper)lInterface.getUserDetails("naveen");
		User user = userWrapper.getUser();
		System.out.println(user.getUserPassword());
		System.out.println("Done");
		
	}

}
