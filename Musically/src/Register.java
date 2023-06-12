import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener, MouseListener{

    private JLabel palabra_sigin;
    private JLabel f_register;
    static JTextField  username;
    private JLabel  f_username;
    static JTextField  nombre;
    private JLabel  f_name;
    static JTextField  surname;
    private JLabel  f_surname;
    static JPasswordField password;
    private JLabel  f_password;
    private JButton signin;

    public Register(){


        this.palabra_sigin = new JLabel("Register", JLabel.CENTER); // Crear Etiqueta Login y elegir donde queremos que se
        this.palabra_sigin.setBounds(70, 200, 462, 110);
        this.palabra_sigin.setFont(new Font("Montserrat", Font.BOLD, 23));
        this.palabra_sigin.setForeground(Color.white);

        Register.username = new JTextField();
        Register.username.setHorizontalAlignment(JTextField.CENTER);
        Register.username.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        Register.username.setBounds(100, 360, 399, 65);
        Register.username.addMouseListener(this);

        this.f_username = new JLabel("Username");
        this.f_username.setFont(new Font("Montserrat", Font.BOLD, 16));
        this.f_username.setBounds(100, 320, 200, 36);
        this.f_username.setForeground(Color.WHITE);
        

        Register.nombre = new JTextField();
        Register.nombre.setHorizontalAlignment(JTextField.CENTER);
        Register.nombre.setBounds(100, 510, 399, 65);
        Register.nombre.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));

        this.f_name = new JLabel("Name");
        this.f_name.setFont(new Font("Montserrat", Font.BOLD, 16));
        this.f_name.setBounds(100, 470, 200, 36);
        this.f_name.setForeground(Color.white);
       
        
        
        Register.surname = new JTextField();
        Register.surname.setHorizontalAlignment(JTextField.CENTER);
        Register.surname.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));
        Register.surname.setBounds(100, 660, 399, 65);
        
        this.f_surname = new JLabel("Surname");
        this.f_surname.setFont(new Font("Montserrat", Font.BOLD, 16));
        this.f_surname.setBounds(100, 620, 200, 36);
        this.f_surname.setForeground(Color.white);
        
        Register.password = new JPasswordField();
        Register.password.setHorizontalAlignment(JPasswordField.CENTER);
        Register.password.setBounds(100, 810, 399, 65);
        Register.password.setBorder(BorderFactory.createLineBorder(Color.decode("0xffffff")));

        this.f_password = new JLabel("Password");
        this.f_password.setFont(new Font("Montserrat", Font.BOLD, 16));
        this.f_password.setBounds(100, 770, 200, 36);
        this.f_password.setForeground(Color.white);
        

       this.signin = new JButton("Register");
        this.signin.setForeground(Color.WHITE);
        this.signin.setBackground(new Color(0xEB63DD));
        this.signin.setBounds(180, 900, 250, 70);
        this.signin.setFocusable(false);
        this.signin.setFont(new Font("Montserrat", Font.BOLD, 20));
        this.signin.setBorder(BorderFactory.createEtchedBorder());
        this.signin.addActionListener(this);
    
         // Imagenes e Iconos
        ImageIcon closeIcon = new ImageIcon(
            new ImageIcon("src\\photos\\conlema.png").getImage().getScaledInstance(350, 103, Image.SCALE_DEFAULT));
        this.f_register = new JLabel(closeIcon, JLabel.CENTER);
        this.f_register.setBounds(0, 70, 600, 103);
        ImageIcon icono = new ImageIcon("src\\photos\\icono.png");
        this.setIconImage(icono.getImage());// cambiar icono de ventana
        this.setTitle("Register"); // titiulo aplicación
        this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
        this.setSize(620, 1024); // dimensiones de la aplicación
        this.setLayout(null);
        this.setResizable(false); // para que no se pueda modificar las dimensiones
        this.setDefaultCloseOperation(Register.DISPOSE_ON_CLOSE);// Para que se cierre al dirigirse al programa principal
        
   
        this.add(f_register);
        this.add(palabra_sigin);
        this.add(f_username);
        this.add(username);
        this.add(f_surname);
        this.add(surname);
        this.add(nombre);
        this.add(f_password);
        this.add(password);
        this.add(f_name);
        this.add(signin);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        
       
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
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
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== signin){
            if(String.valueOf(Register.password) !=null & Register.username != null & Register.nombre != null ){
                this.setVisible(false); 
                Querys.signIn();
            }
            
        }
    }
    
}
