
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Login extends JFrame implements ActionListener, MouseListener {
    private JLabel f_login;
    private JLabel palabra_login;// login palaabra
    private JButton button;
    static JTextField username;
    static JPasswordField password;
    private JLabel f_password;
    private JLabel f_username;
    private JLabel registro;

    public Login() {

        // Button Login
        this.button = new JButton();
        this.button.addActionListener(this);
        this.button.setText("Login");
        this.button.setForeground(Color.WHITE);
        this.button.setBackground(new Color(0xEB63DD));
        this.button.setBounds(180, 580, 250, 70);
        this.button.setFocusable(false);
        this.button.setFont(new Font("Montserrat", Font.BOLD, 20));
        this.button.setBorder(BorderFactory.createEtchedBorder());
        // Imagenes e Iconos
    
        ImageIcon closeIcon = new ImageIcon(
                new ImageIcon("Photos/conlema.png").getImage().getScaledInstance(350, 103, Image.SCALE_DEFAULT));
        ImageIcon icono = new ImageIcon("Photos/icono.png");
        this.setIconImage(icono.getImage());// cambiar icono de ventana

        // Etiquetas utilizadas para añadir imagen y otras cosas
        this.palabra_login = new JLabel("Login", JLabel.CENTER); // Crear Etiqueta Login y elegir donde queremos que se
                                                                 // situ
        this.button.setBorder(BorderFactory.createLineBorder(Color.decode("0xEB63DD")));
        this.palabra_login.setFont(new Font("Montserrat", Font.BOLD, 30)); // Escoger fuente, tipo de estilo y tamaño
        this.palabra_login.setBounds(240, 230, 95, 42);
        this.palabra_login.setForeground(Color.white);
        this.f_login = new JLabel(closeIcon, JLabel.CENTER);
        this.f_login.setBounds(0, 100, 600, 103);

        // Creación campo usuario

        Login.username = new JTextField();
        Login.username.setHorizontalAlignment(JTextField.CENTER);
        Login.username.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        Login.username.setBounds(100, 320, 399, 65);

        this.f_username = new JLabel("Username");
        this.f_username.setFont(new Font("Montserrat", Font.BOLD, 23));
        this.f_username.setBounds(100, 280, 200, 36);
        this.f_username.setForeground(Color.WHITE);
        Login.username.addMouseListener(this);

        // Creación campo contraseña
        Login.password = new JPasswordField();
        Login.password.setHorizontalAlignment(JPasswordField.CENTER);
        Login.password.setBounds(100, 450, 399, 65);
        Login.password.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        this.f_password = new JLabel("Password");
        this.f_password.setFont(new Font("Montserrat", Font.BOLD, 23));
        this.f_password.setBounds(100, 410, 200, 36);
        this.f_password.setForeground(Color.white);

        this.registro = new  JLabel("Haven't got an Account yet ?");
        this.registro.setFont(new Font("Montserrat", Font.BOLD, 14));
        this.registro.setBounds(100,430,200,200);
        this.registro.setForeground(new Color(0X4F53FF));
        this.registro.addMouseListener(this);

        // Creación ventana login
        this.setTitle("Musically"); // titiulo aplicación
        this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
        this.setSize(600, 775); // dimensiones de la aplicación
        this.setLayout(null);
        this.setResizable(false); // para que no se pueda modificar las dimensiones
        this.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);// Para que se cierre al dirigirse al programa principal

        // this.add(image);
        this.add(f_username);
        this.add(f_password);
        this.add(username);
        this.add(password);
        this.add(button);
        this.add(f_login);
        this.add(registro);
        this.add(palabra_login);
        this.setVisible(true); // Para que se aquello de la ventana

    }

    //
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            this.setVisible(false);
            Querys.Login();
            

        }

    }


    

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == Login.username) {
            if (Login.username.getText().equalsIgnoreCase("Username")) {
                Login.username.setText("");
            }

        }

        if (e.getSource() == Login.password) {
            if (String.valueOf(Login.password.getPassword()).equalsIgnoreCase("Password")) {

            }
        }

        if (e.getSource() == this.registro){
            this.setVisible(false);
            new Register();
           
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }


    public JButton getButton() {
        return this.button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JTextField getUsername() {
        return Login.username;
    }


    public JPasswordField getPassword() {
        return Login.password;
    }




}