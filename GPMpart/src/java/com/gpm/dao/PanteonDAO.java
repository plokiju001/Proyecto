package com.gpm.dao;

/**
 *
 * @author Azael
 */
import Modelo.AdeudosManten;
import Modelo.Conceptos;
import Modelo.Cudadanos;
import Modelo.Cuentas;
import Modelo.HistCuentas;
import Modelo.Localidad;
import Modelo.Panteon;
import Modelo.Propietario;

import com.utiles.datos.Formatos;
import com.utiles.datos.MSSQLConfig;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.jdom2.JDOMException;


public class PanteonDAO {
    
    private final int IDCONEXION = 14; // ID conexion
    
    private String dbName;
    private Connection cnx;
    private String xmlFile;
    
    public PanteonDAO() {
        
        cnx = null;
        dbName = "";
        
    }
    
    private void setLog(String mensaje, String proceso) {		
        System.out.println(Formatos.getHoyStr() + "\t" + this.getClass().getName() + "::"+ proceso + "\t" +
                        mensaje);
    }
    
    /***
    * Conecta a la base de datos SQL Server
    * @throws SQLException
    * @throws JDOMException
    * @throws IOException
    */
    private void conectarBD() throws SQLException, JDOMException, IOException {
        if (cnx == null || cnx.isClosed()) {
            MSSQLConfig sql = new MSSQLConfig();

            setLog("xmlFile","conectarBD");			

            sql.loadFromXML(xmlFile, IDCONEXION);
            dbName = sql.getHost() + " - " + sql.getDb();
            cnx = sql.setUP();
            cnx.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        }
    }
    /***
    * Desconecta la conexión actual a la base de datos
    * @throws SQLException
    */
    public void desconectaBD() throws SQLException {
        if (cnx != null) {
            if (!cnx.isClosed()) {
                cnx.close();
                setLog("Desconectando Base de Datos: " + dbName,"desconectaBD");				
            }
        }
    }
    
    public String getXmlFile() {
        return xmlFile;
    }

    public void setXmlFile(String xmlFile) {
        this.xmlFile = xmlFile;
    }
    
    public void testcon() throws SQLException, JDOMException, IOException{
        conectarBD();
    }
    
   public AdeudosManten setAdeudosManten(AdeudosManten adm) throws SQLException, JDOMException, IOException{
        
        
        String ad = "exec sp_inserta_AdeudosManteni ?, ?, ?, ?, ?, ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(ad);
        pst.setInt(1, adm.getAño());
        pst.setFloat(2, adm.getCuota());
        pst.setFloat(3, adm.getDescCuota());
        pst.setFloat(4, adm.getDescRecargo());
        pst.setFloat(5, adm.getRecargo());
        pst.setFloat(6, adm.getSubtotal());
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            adm.setId(rs.getInt(1));
        }
        
        rs.close();
        pst.close();
        
        return adm;
    }
    
    public ArrayList<AdeudosManten> getAdeudosManten() throws SQLException, JDOMException, IOException{
        
        ArrayList<AdeudosManten> Adeudolist = new ArrayList<AdeudosManten>();
        
        String sql = "Select idAdeudosManten, año, cuota, desCuota, recargo, descRecargo, subtotal"
                + " from AdeudosManteni where estatus = ? order by idAdeudosManten desc";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        pst.setInt(1, 1);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            
            AdeudosManten a = new AdeudosManten();
            
            a.setId(rs.getInt(1));
            a.setAño(rs.getInt(2));
            a.setCuota(rs.getFloat(3));
            a.setDescCuota(rs.getFloat(4));
            a.setDescRecargo(rs.getFloat(5));
            a.setRecargo(rs.getFloat(6));
            a.setSubtotal(rs.getFloat(7));
            
            Adeudolist.add(a);
        }
        
        rs.close();
        pst.close();
        
        
        return Adeudolist;
    }
    
    
    public Panteon setPanteon(Panteon pan) throws SQLException, JDOMException, IOException{
        
        
        String p = "exec sp_inserta_Panteon ?, ?, ?, ?, ?, ?, ?, ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(p);
        pst.setInt(1, pan.getCodigo());
        pst.setString(2, pan.getNombre());
        pst.setString(3, pan.getResponsable());
        pst.setString(4, pan.getCalle());
        pst.setInt(5, pan.getNum());
        pst.setString(6, pan.getEstatus());
        pst.setString(7, pan.getHorarioAtencion());
        pst.setString(8, pan.getMunicipio());
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            pan.setId(rs.getInt(1));
        }
        
        rs.close();
        pst.close();
        
        return pan;
    }
    
    public ArrayList<Panteon> getPanteon() throws SQLException, JDOMException, IOException{
        
        ArrayList<Panteon> Panteonlist = new ArrayList<Panteon>();
        
        String sql = "Select idPanteon, Codigo, Nombre, Responsable, Calle, Numero, Estatus, HorarioAtencion, Municipio"
                + " from Panteon where estatus = ? order by idPanteon desc";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        pst.setInt(1, 1);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            
            Panteon p = new Panteon();
            
            p.setId(rs.getInt(1));
            p.setCodigo(rs.getInt(2));
            p.setNombre(rs.getString(3));
            p.setResponsable(rs.getString(4));
            p.setCalle(rs.getString(5));
            p.setNum(rs.getInt(6));
            p.setEstatus(rs.getString(7));
            p.setHorarioAtencion(rs.getString(8));
            p.setMunicipio(rs.getString(9));
            
            Panteonlist.add(p);
        }
        
        rs.close();
        pst.close();
        
        
        return Panteonlist;
    }
    
    public Localidad setLocalidad(Localidad loc) throws SQLException, JDOMException, IOException{
        
        
        String l = "exec sp_inserta_Localidad ?, ?, ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(l);
        pst.setInt(1, loc.getCodigo());
        pst.setString(2, loc.getNombre());
        pst.setString(3, loc.getTipo());
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            loc.setId(rs.getInt(1));
        }
        
        rs.close();
        pst.close();
        
        return loc;
    }
    
    public ArrayList<Localidad> getLocalidads() throws SQLException, JDOMException, IOException{
        
        ArrayList<Localidad> LocalList = new ArrayList<Localidad>();
        
        String sql = "Select idLocalidad, Codigo, Nombre, Tipo "
                + " from Panteon where estatus = ? order by idLocalidad desc";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        pst.setInt(1, 1);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            
            Localidad l = new Localidad();
            
            l.setId(rs.getInt(1));
            l.setCodigo(rs.getInt(2));
            l.setNombre(rs.getString(3));
            l.setTipo(rs.getString(4));
            
            LocalList.add(l);
        }
        
        rs.close();
        pst.close();
        
        
        return LocalList;
    }
    
    
    
    public Cudadanos setCiudadanos (Cudadanos ciu) throws SQLException, JDOMException, IOException{
        
        String cd = "exec sp_inserta_Ciudadanos ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(cd);
        pst.setString(1, ciu.getRFC());
        pst.setString(2, ciu.getCURP());
        pst.setString(3, ciu.getNombre());
        pst.setString(4, ciu.getCalle());
        pst.setInt(5, ciu.getNumExt());
        pst.setInt(6, ciu.getNumInt());
        pst.setString(7, ciu.getColonia());
        pst.setString(8, ciu.getPoblacion());
        pst.setInt(9, ciu.getCP());
        pst.setString(10, ciu.getMunicipio());
        pst.setString(11, ciu.getEdo());
        pst.setString(12, ciu.getPais());
        pst.setString(13, ciu.getEstatus());
        
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            ciu.setId(rs.getInt(1));
        }
        
        rs.close();
        pst.close();
        
        return ciu;
    }
    
    public ArrayList<Cudadanos> getCiudadanos() throws SQLException, JDOMException, IOException{
        
        ArrayList<Cudadanos> Ciudlist = new ArrayList<Cudadanos>();
        
        String sql = "Select idCiudadanos, RFC, CURP, Nombre, Calle, NumExt, NumInt, Colonia, Poblacion, CP, Municipio, Estado, Pais "
                + " from Ciudadanos where estatus = ? order by idCiudadanos desc";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        pst.setInt(1, 1);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            
            Cudadanos c = new Cudadanos();
            
            c.setId(rs.getInt(1));
            c.setCP(rs.getInt(2));
            c.setCURP(rs.getString(3));
            c.setNumExt(rs.getInt(4));
            c.setNumInt(rs.getInt(5));
            c.setCalle(rs.getString(6));            
            c.setColonia(rs.getString(7));
            c.setEdo(rs.getString(8));
            c.setMunicipio(rs.getString(9));
            c.setNombre(rs.getString(10));
            c.setPais(rs.getString(11));
            c.setPoblacion(rs.getString(12));
            c.setRFC(rs.getString(13));
            c.setEstatus(rs.getString(14));
            
            Ciudlist.add(c);
        }
        
        rs.close();
        pst.close();
        
        
        return Ciudlist;
    }
    
    
    
    
    public void updateTable(String tb, String col, String val, String where) throws SQLException, JDOMException, IOException{
        
        String sql = "update "+tb+" set "+col+" = '"+val+"' where "+where;
        
        System.out.println(sql);
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        
        pst.execute();
        
        pst.close();
    }
    
    public void updateTable(String tb, String col, int val, String where) throws SQLException, JDOMException, IOException{
        
        String sql = "update "+tb+" set "+col+" = "+val+" where "+where;
        
        System.out.println(sql);
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(sql);
        
        pst.execute();
        
        pst.close();
    }
    
      public Usr getUser(String usr, String pw) throws SQLException, JDOMException, IOException{
        Usr u = new Usr();
        
        String q = " Select * from usuarios where usuario = ? and pass = ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(q);
        pst.setString(1, usr);
        pst.setString(2, pw);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            
            u.setN_empleado(rs.getString(1));
            u.setNombre(rs.getString(2));
            u.setApellido(rs.getString(3));
            u.setTelefono(rs.getString(4));
            u.setCorreo(rs.getString(5));
            u.setUsuario(rs.getString(6));
            u.setPass(rs.getString(7));
            u.setPermisos(rs.getInt(8));
            u.setImagen(rs.getString(9));
            
        }
        
        rs.close();
        pst.close();
        
        return u;
    }
    
    public Usr setUser(Usr u) throws SQLException, JDOMException, IOException{
        
        String q = " exec sp_inserta_usuario ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ";
        
        conectarBD();
        
        PreparedStatement pst = cnx.prepareStatement(q);
        pst.setString(1, u.getN_empleado());
        pst.setString(2, u.getNombre());
        pst.setString(3, u.getApellido());
        pst.setString(4, u.getTelefono());
        pst.setString(5, u.getCorreo());
        pst.setString(6, u.getUsuario());
        pst.setString(7, u.getPass());
        pst.setInt(8, u.getPermisos());
        pst.setString(9, u.getImagen());
        
        pst.execute();
        
        pst.close();
        
        return u;
    }
}
