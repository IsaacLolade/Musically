import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Querys {

    static Scanner s = new Scanner(System.in);

    public static void signIn() {

        /// A modo de preuba en caso de que realice el sign in
        try {

            String Query = " INSERT INTO usuarios(id_usuario,nombre,apellidos,contrasenya) VALUES(?,?,?,?)";
            System.out.println("Introduzca el id de usuario");
            String username = s.nextLine();
            System.out.println("Introduzca su nombre");
            String name = s.nextLine();
            System.out.println("Introduzca el apellido");
            String lastname = s.nextLine();
            System.out.println("Introduzca la contraseña");
            String password = s.nextLine();

            PreparedStatement st = Conexion.con.prepareStatement(Query);
            st.setString(1, username);
            st.setString(2, name);
            st.setString(3, lastname);
            st.setString(4, password);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar en la tabla usuarios" + e);
        }
        Conexion.closeConn();
    }

    public static void Login() {
        Conexion.conectar();
        try {

            String user = Login.username.getText();
            String pass = String.valueOf(Login.password.getPassword());

            String Query = "SELECT contrasenya, id_usuario FROM usuarios WHERE id_usuario = ? and contrasenya=?";
            PreparedStatement st = Conexion.con.prepareStatement(Query);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Principal principal = new Principal();
                principal.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bienvenido " + user, " Welcome", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (SQLException e) {
            System.out.println("No se encuentra ningún usuario con esas credenciales" + e);
        }
        Conexion.closeConn();
    }

    public static void verCaratula() {
        Conexion.conectar();

    }
}