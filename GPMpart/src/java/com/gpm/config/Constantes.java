/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpm.config;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author SHALOM
 */
public class Constantes {
    public static String getURL(HttpServletRequest hreq) {
            
		String url = "http:/172.16.1.76:8080" + hreq.getContextPath();
                
		System.out.println(url);
		return url;
	}
	
	public static String getURLSimple(HttpServletRequest hreq) {
		String url = getURL(hreq);
		System.out.println(url);
		return url;
	}
	
	public static String getConexionStr(HttpServletRequest hreq) {
            
                String url = "http://172.16.11.51:8080/system/etc/data/conexion_TEST.xml";
		System.out.println(url);
		return url;
	}
	
	public static String getStatusStr(HttpServletRequest hreq) {
		String url = getURL(hreq) + "/etc/status.xml";
		System.out.println(url);
		return url;
	}
	/*
	public static Estatus getEstatus(String url) {
		Estatus sts = new Estatus();
		
                System.out.println(" --- "+url + "/etc/status.xml");
                
		try {
			sts.loadFromXML(url + "/etc/status.xml");
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sts;
	}*/
}


