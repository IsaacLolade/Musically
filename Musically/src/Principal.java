import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal extends JFrame implements ActionListener {

        private JLabel label;
        private JLabel f_principal;
        private JPanel panel;
        private JPanel panel_1;
        private JPanel allofme;
        private JComboBox desplegable;
        private JScrollPane scroll;
        private JLabel prueba;

        public Principal() {

                // Panel
                this.panel = new JPanel();// Creación de panel
                this.panel.setBackground(new Color(0XD9D9D9));// Añadiendo color al panel
                this.panel.setBounds(0, 774, 1114, 186); // Indicamos donde queremos que vaya situa<do y las mediadas

                // Contenido de Panel

                ImageIcon allofme = new ImageIcon(
                                new ImageIcon("src\\DB\\portada\\allofme.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                prueba = new JLabel(allofme);
                prueba.setBounds(20, 20, 141, 171);
                // Scroll panel
                this.panel_1 = new JPanel();
                scroll = new JScrollPane(this.panel_1);
                scroll.setBounds(200, 320, 700, 400);
                scroll.setPreferredSize(new Dimension(400, 400));
                scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                JScrollBar vertical = scroll.getVerticalScrollBar();
                vertical.setValue(vertical.getMaximum());
                this.panel_1.setPreferredSize(new Dimension(600, 1200));
                this.panel_1.setBackground(new Color(0x0B0633));
                this.panel_1.setLayout(null);
                this.panel_1.add(prueba);

                // linea de reproducciond e cancion
                ImageIcon lineam = new ImageIcon("src\\iconos\\linea.png");
                JLabel linea = new JLabel(lineam);
                linea.setBounds(14, 10, 1100, 100);

                // iconos de debajo de la linea de reproducción

                ImageIcon aleatorio = new ImageIcon(new ImageIcon("src\\iconos\\aleatorio.png").getImage()
                                .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
                JLabel aleatorios = new JLabel(aleatorio);
                aleatorios.setBounds(335, 80, 24, 24);

                ImageIcon anteriors = new ImageIcon(
                                new ImageIcon("src\\iconos\\anterior.png").getImage().getScaledInstance(24, 24,
                                                Image.SCALE_DEFAULT));
                JLabel anterior = new JLabel(anteriors);
                anterior.setBounds(450, 80, 24, 24);

                ImageIcon siguiente = new ImageIcon(new ImageIcon("src\\iconos\\siguiente.png").getImage()
                                .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
                JLabel siguientes = new JLabel(siguiente);
                siguientes.setBounds(660, 80, 24, 24);

                ImageIcon bucle = new ImageIcon(
                                new ImageIcon("src\\iconos\\bucle.png").getImage().getScaledInstance(24, 24,
                                                Image.SCALE_DEFAULT));
                JLabel bucles = new JLabel(bucle);
                bucles.setBounds(770, 80, 24, 24);

                ImageIcon play = new ImageIcon(
                                new ImageIcon("src\\iconos\\play.png").getImage().getScaledInstance(24, 24,
                                                Image.SCALE_DEFAULT));
                JLabel plays = new JLabel(play);
                plays.setBounds(555, 80, 24, 24);

                this.panel.add(linea);
                this.panel.add(aleatorios);
                this.panel.add(anterior);
                this.panel.add(siguientes);
                this.panel.add(bucles);
                this.panel.add(plays);

                this.panel.setLayout(null);
                // Imagenes e Iconos
                ImageIcon closeIcon = new ImageIcon(
                                new ImageIcon("src\\photos\\sinlema.png").getImage().getScaledInstance(350, 103,
                                                Image.SCALE_DEFAULT));
                ImageIcon icono = new ImageIcon("src\\photos\\icono.png");
                this.setIconImage(icono.getImage());// cambiar icono de ventana

                // Etiquetas utilizadas para añadir imagen y otras cosas
                this.label = new JLabel("We are happy to have back, hope you have a nice time ;)", JLabel.CENTER); // Crear
                                                                                                                   // Etiqueta
                                                                                                                   // Login
                                                                                                                   // y
                                                                                                                   // elegir
                                                                                                                   // donde
                                                                                                                   // queremos
                                                                                                                   // que
                                                                                                                   // se
                                                                                                                   // situe
                this.label.setFont(new Font("Montserrat", Font.BOLD, 20)); // Escoger fuente, tipo de estilo y tamaño
                this.label.setBounds(150, 200, 800, 22);
                this.label.setForeground(Color.white);
                this.f_principal = new JLabel(closeIcon, JLabel.CENTER);
                this.f_principal.setBounds(320, 0, 462, 110);

                String[] musica = { " ", "R&B", "Torch ballad", "Reggae", "Soul", "Electronic", "Pop", "Hip Hop",
                                "Orchestral Pop", "Afro-Fusion" };// Opciones
                // que se
                // podrán
                // escoger
                // para
                // filtra
                // las canciones o albumes
                // DEsplegable
                desplegable = new JComboBox(musica); // Crear Desplegable
                desplegable.setBounds(920, 280, 110, 20);
                desplegable.addActionListener(this);

                this.setVisible(true);
                this.setTitle("Musically"); // titiulo aplicación
                this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
                this.setSize(1114, 960); // dimensiones de la aplicación
                this.setLayout(null);
                this.setResizable(false); // para que no se pueda modificar las dimensiones
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// Para que se cierre el programa al darle a la X

                this.add(desplegable);
                this.add(scroll);
                this.add(this.panel);
                this.add(f_principal);
                this.add(label);
                this.setVisible(true); // Para que se aquello de la ventana
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == this.desplegable) {
                        if (desplegable.getSelectedItem().equals("R&B")) {

                        } else if (desplegable.getSelectedItem().equals("Reggeaton")) {

                        } else if (desplegable.getSelectedItem().equals("Pop")) {

                        } else if (desplegable.getSelectedItem().equals("Soul")) {

                        } else if (desplegable.getSelectedItem().equals("Rock & Roll")) {

                        } else if (desplegable.getSelectedItem().equals("Soul")) {

                        }

                }
        }

        public static void main(String[] args) {
                Principal p = new Principal();
        }
}
