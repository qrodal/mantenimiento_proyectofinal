/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author CarlosP
 */
public class Database {
    private static String db="prueba";
    private static String user="root";
    private static String pass="root";
    private static String host="localhost:3306";
    private static String server="jdbc:mysql://"+host+"/"+db;


public static Connection getConexion(){
    Connection cn=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection(server,user,pass);
}
catch(Exception e){
System.out.println(String.valueOf(e));
}
return cn;
}
public static ResultSet getTabla(String Consulta){
    Connection cn=getConexion();
    Statement st;
    ResultSet datos=null;
    try{
        st=cn.createStatement();
        datos=st.executeQuery(Consulta);
    }
    catch(Exception e){
        System.out.print(e.toString());
    }
    return datos;
}
}