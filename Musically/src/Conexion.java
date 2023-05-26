import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static Scanner s = new Scanner(System.in);

    protected static Connection con = null;

    // Realizar la concexiona la base de datos
    public static void conectar() {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("No driver" + e);
            }
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musically", "root", "");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Cerrar base de datos en caso de que se encuentre abierto
    public static void closeConn() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Conexion.conectar();

    }

}
