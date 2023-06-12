
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class Querys {


    public static void signIn() {

        /// A modo de preuba en caso de que realice el sign in
        try {

            String query = "INSERT INTO usuarios (id_usuario,nombre,apellidos,contrasenya) VALUES(?,?,?,?)";
           
            String username = Register.username.getText();
            String lastname = Register.surname.getText();
            String passwd = String.valueOf(Register.password.getPassword());
            String name = Register.nombre.getText();
            
           PreparedStatement st = Conexion.con.prepareStatement(query);
            st.setString(1, username);
            st.setString(2,name );
            st.setString(3, lastname);
            st.setString(4, passwd);
            System.out.println(query);
            st.executeUpdate();
            Principal principal = new Principal();
            principal.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido " + username, " Welcome musician ", JOptionPane.INFORMATION_MESSAGE); // En
                                                                                                         // sesión

           
        } catch (SQLException e) {
            System.out.println("ERROR DE TIPO:" + e);
            JOptionPane.showMessageDialog(null, "No se ha podido añadir el exámen satisfactoriamente " , "Insert error", JOptionPane.ERROR_MESSAGE); // En
                                                                                                         // sesión
        }
        
       

    } 

    public static void Login() {

        try {

            String user = Login.username.getText();
            String pass = String.valueOf(Login.password.getPassword());

            String query = "SELECT contrasenya, id_usuario FROM usuarios WHERE id_usuario = ? and contrasenya=?";
            PreparedStatement st = Conexion.con.prepareStatement(query);
            st.setString(1, user);// Seleccionamos el usuario
            st.setString(2, pass);// Seleccionamos la contraseña
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Principal principal = new Principal();
                principal.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bienvenido " + user, " Welcome musician ", JOptionPane.INFORMATION_MESSAGE); // En
                                                                                                             // sesión

            } else {
                JOptionPane.showMessageDialog(null, "Los datos introducidos son incorrectos");
                new Login();
            }

        } catch (SQLException e) {
            System.out.println("ERROR DE TIPO:" + e);
        }

    }

    public static ArrayList<Object> returnMusicInfoFromId(String id) {
        ArrayList<Object> musicInfo = new ArrayList<Object>();

        try {
            String query = "SELECT * from canciones WHERE nombre_cancion = ?";

            PreparedStatement st = Conexion.con.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                musicInfo.add(rs.getString("artista"));
                musicInfo.add(rs.getString("genero"));
                musicInfo.add(rs.getString("descripcion"));
                musicInfo.add(rs.getBlob("portada"));

            }

        } catch (SQLException e) {
            System.out.println("ERROR DE TIPO:" + e);
        }

        return musicInfo;


       
    }
    public static ArrayList<Object> returnAlbuminfoFromId(String id){
        ArrayList<Object> albumInfo = new ArrayList<Object>();

        try {
            String query = "SELECT * from albumes WHERE id_album = ?";

            PreparedStatement st = Conexion.con.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                albumInfo.add(rs.getString("artista"));
                albumInfo.add(rs.getString("genero"));
                albumInfo.add(rs.getString("descripcion"));
                albumInfo.add(rs.getBlob("portada"));

            }

        } catch (SQLException e) {
            System.out.println("ERROR DE TIPO:" + e);
        }

        return albumInfo;

    }

   
}
