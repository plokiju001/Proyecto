package com.utiles.datos;


import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class MSSQLConfig implements Serializable {

	private static final long serialVersionUID = 5546055827021733740L;

	//private static final String classForName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String classForName = "net.sourceforge.jtds.jdbc.Driver";
	//private static final String msSqlCnx = "jdbc:sqlserver://";
	private static final String msSqlCnx = "jdbc:jtds:sqlserver://";

	private String host;
	private int puerto;
	private String instancia;
	private String db;
	private String usuario;
	private String password;
	
	
	public MSSQLConfig() {
		super();
		
		setHost("");
		setDb("");
		setUsuario("");
		setPassword("");
		setPuerto(1433);
		setInstancia("");
		
		try {
			Class.forName(getClassforname());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MSSQLConfig(Connection cnx, String host, int puerto, String db,
			String usuario, String password, String instancia) {
		this();
		
		this.host = host;
		this.puerto = puerto;
		this.db = db;
		this.usuario = usuario;
		this.password = password;
		this.instancia = instancia;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getClassforname() {
		return classForName;
	}

	public static String getMssqlcnx() {
		return msSqlCnx;
	}
	
	private String getUrlConexion() {
		//return getMssqlcnx() + getHost() + ":" + getPuerto() + "/" + getDb();
		if (instancia.equals(""))
			return getMssqlcnx() + getHost() + ":" + getPuerto() + ";databaseName=" + getDb();
		else
			return getMssqlcnx() + getHost() + ":" + getPuerto() + ";instance=" + getInstancia() + ";scheme=dbo;databaseName=" + getDb();
	}
	
	public Connection setUP() throws SQLException {
		//SQLServerDataSource ds = new SQLServerDataSource();
		//SQLServerXADataSource ds = new SQLServerXADataSource();
		
		/*ds.setServerName(getHost());
		ds.setUser(getUsuario());
		ds.setDatabaseName(getDb());
		ds.setPassword(getPassword());
		ds.setPortNumber(getPuerto());
		ds.setApplicationName("Tlj-Impuestos");*/
		
		
		
		System.out.println(Formatos.getHoyStr() + "\tConectando MS Sql Server: " + getHost() + ":" + getPuerto() + "; databaseName=" + getDb() + 
				"; user="+getUsuario() + ";instance=" + getInstancia());
		
		System.out.println(getUrlConexion());
		return DriverManager.getConnection(getUrlConexion(), getUsuario(), getPassword());
		
		//return ds.getConnection(); jdbc:jtds:sqlserver://172.16.1.107;instance=SQL2008;scheme=dbo
	}
	
	public void loadFromXML(String xml) throws IOException, JDOMException {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(xml);
		
		Element CNX = doc.getRootElement();
		
		this.setHost(CNX.getChildText("host"));
		this.setPuerto(Integer.parseInt(CNX.getChildText("puerto")));
		this.setDb(CNX.getChildText("db"));
		this.setUsuario(CNX.getChildText("usuario"));
		this.setPassword(CNX.getChildText("password"));
		this.setInstancia(CNX.getChildText("scheme"));
		
	}
	
	public void loadFromXML(String xmlFile, int idConexion) throws JDOMException, IOException {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(xmlFile);
		
		Element Conexiones = doc.getRootElement();
		
		List<Element> ConexionLst = Conexiones.getChildren();
		Iterator<Element> ConexionIt = ConexionLst.iterator();
		
		while (ConexionIt.hasNext()) {
			Element Conexion = ConexionIt.next();
			
			if (Conexion.getAttributeValue("id").equals(idConexion+"")) {
				this.setHost(Conexion.getChildText("host"));
				this.setPuerto(Integer.parseInt(Conexion.getChildText("port")));
				this.setDb(Conexion.getChildText("database"));
				this.setUsuario(Conexion.getChildText("user"));
				this.setPassword(Conexion.getChildText("password"));
				this.setInstancia(Conexion.getChildText("scheme"));
			}
		}
	}
}
