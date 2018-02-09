package it.main.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import it.main.WsReach;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public class WsReachImpl implements WsReach
{

	@WebMethod
	public String getUs(String s) {
		return "AAAAhaaaaaa";
	}

}
