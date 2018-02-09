package it.main;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WsReach {

	@WebMethod
	String getUs(String s);
}
