import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

public class Login extends JFrame implements ActionListener, MouseListener {
    private JLabel f_login;
    private JButton b_login = new JButton();
    private JLabel palabra_login;// login palaabra
    private JButton button;
    protected static JTextField username;
    protected static JPasswordField password;
    private JLabel f_password;
    private JLabel f_username;

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
                new ImageIcon("src\\photos\\conlema.png").getImage().getScaledInstance(350, 103, Image.SCALE_DEFAULT));
        ImageIcon icono = new ImageIcon("src\\photos\\icono.png");
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

        this.username = new JTextField();
        this.username.setHorizontalAlignment(JTextField.CENTER);
        this.username.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        this.username.setBounds(100, 320, 399, 65);

        this.f_username = new JLabel("Username");
        this.f_username.setFont(new Font("Montserrat", Font.BOLD, 23));
        this.f_username.setBounds(100, 280, 200, 36);
        this.f_username.setForeground(Color.WHITE);
        this.username.addMouseListener(this);

        // Creación campo contraseña
        this.password = new JPasswordField();
        this.password.setHorizontalAlignment(JPasswordField.CENTER);
        this.password.setBounds(100, 450, 399, 65);
        this.password.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        this.f_password = new JLabel("Password");
        this.f_password.setFont(new Font("Montserrat", Font.BOLD, 23));
        this.f_password.setBounds(100, 410, 200, 36);
        this.f_password.setForeground(Color.white);
        // Creación ventana login
        this.setTitle("Musically"); // titiulo aplicación
        this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
        this.setSize(600, 775); // dimensiones de la aplicación
        this.setLayout(null);
        this.setResizable(false); // para que no se pueda modificar las dimensiones
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);// Para que se cierre al dirigirse al programa principal

        // this.add(image);
        this.add(f_username);
        this.add(f_password);
        this.add(username);
        this.add(password);
        this.add(button);
        this.add(f_login);
        this.add(palabra_login);
        this.setVisible(true); // Para que se aquello de la ventana

    }

    //
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            Querys.Login();

        }

    }

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        getToolkit().getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.username) {
            if (this.username.getText().equalsIgnoreCase("Username")) {
                this.username.setText("");
            }

        }

        if (e.getSource() == this.password) {
            if (String.valueOf(this.password.getPassword()).equalsIgnoreCase("Password")) {

            }
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

    public JLabel getF_login() {
        return this.f_login;
    }

    public void setF_login(JLabel f_login) {
        this.f_login = f_login;
    }

    public JButton getB_login() {
        return this.b_login;
    }

    public void setB_login(JButton b_login) {
        this.b_login = b_login;
    }

    public JLabel getPalabra_login() {
        return this.palabra_login;
    }

    public void setPalabra_login(JLabel palabra_login) {
        this.palabra_login = palabra_login;
    }

    public JButton getButton() {
        return this.button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JTextField getUsername() {
        return this.username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JPasswordField getPassword() {
        return this.password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

}