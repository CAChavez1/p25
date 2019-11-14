package mysql;

import java.sql.*;

public class Conexion {

    private Connection cnx = null;
    private final String servidor = "localhost";
    private String url;

    public Connection obtener(String usr, String pwd, String base) throws SQLException, ClassNotFoundException {
        this.url = "jdbc:mysql://" + servidor + "/" + base + "";
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection(url, usr, pwd);
            } catch (ClassNotFoundException ex) {
            }
        }
        return cnx;
    }

    public void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

}
