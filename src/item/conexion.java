/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rubendavid
 */
public class conexion {

    private static Connection conexion;

    public static Connection getConexion() {
        try {
//            Se crea una instancia de la clase manejadora de mySQL
            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Se crea la conexion con la base de datos deseada
            conexion = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost/lpiii",
                    "root", "123456");
        } catch (Exception e) {
//            Si ocurrio un error se muestra el mensaje
            JOptionPane.showMessageDialog(null, "Error al conectarse", "Conexion",
                    JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
}