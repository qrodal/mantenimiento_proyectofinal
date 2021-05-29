/*
1123067
Juan Carlos Perez Buenrostro
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
      public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    public conexion(){
    String driver = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/prueba";
    
    try {
        Class.forName(driver);
        con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        con = DriverManager.getConnection(URL, "root", "root");
}   catch (Exception e){
    }    
    }
    
    public Connection getConnection(){
        return con;
    }
    }













/*
    public static void main(String[] args) {
        //1.-REQUERIMIENTOS:
        String driver = "com.mysql.jdbc.Driver";
        // 2.- URL (cadena de conexión
        String url = "jdbc:mysql://localhost:3306/hr";

        try {
            Class.forName(driver);
            System.out.println("Conexión Exitosa");
        } catch (Exception e){ 
            System.err.println("Error de Conexión" + e.getMessage());
            return;
        }
        try {
            Connection cn = DriverManager.getConnection(url, "root", "root");
            System.out.println("Conectado a la base de datos");
            System.out.println("-----------------------------");
            System.out.println("Generando consulta");
            String sql = "select * from employees";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //primera conexion con la base de datos 27-03-2021
         /* while(rs.next()){
                
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("---------------------------");
            }
while(rs.next()){
                
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastName"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("phoneNumber"));
                System.out.println(rs.getDouble("salary"));
                System.out.println(rs.getString("hiredate"));
                System.out.println("fin de la Consulta");
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            System.err.println("Sin conexión a la base de datos" + e.getMessage());
            return;
        }

    } */

