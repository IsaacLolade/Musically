import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal extends JFrame implements ActionListener, MouseListener {

        private JLabel label;
        private JLabel f_principal;
        private JPanel panel;
        private JPanel panel_1;
        private JComboBox<String> desplegable;
        private JScrollPane scroll;
        private JLabel prueba;
        private JLabel prueba1;
        private JLabel prueba2;
        private JLabel prueba4;
        private JLabel prueba5;
        private JLabel prueba6;
        private JLabel prueba7;
        private JLabel prueba8;
        private JLabel prueba9;
        private JLabel prueba10;
        private JLabel prueba11;
        private JLabel prueba12;
        private JLabel prueba13;
        private JLabel prueba14;
        private JLabel prueba15;
        private JLabel prueba17;
        private JLabel prueba18;
        private JLabel prueba19;
        private JLabel prueba21;
        private JLabel prueba20;
        private JLabel prueba22;
        private JLabel prueba23;
        private JLabel prueba24;
        private JLabel prueba25;
        private JLabel out;

        public Principal() {

                // Panel
                this.panel = new JPanel();// Creación de panel
                this.panel.setBackground(new Color(0XD9D9D9));// Añadiendo color al panel
                this.panel.setBounds(0, 774, 1114, 186); // Indicamos donde queremos que vaya situa<do y las mediadas

                // Contenido de Panel

                ImageIcon allofme = new ImageIcon(
                                new ImageIcon("DB/Portada/allofme.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba = new JLabel(allofme);
                this.prueba.setBounds(20, 20, 141, 171);
                this.prueba.addMouseListener(this);
                this.prueba.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon doingitWrong = new ImageIcon(
                                new ImageIcon("DB/Portada/doingitWrong.png").getImage().getScaledInstance(141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba1 = new JLabel(doingitWrong);
                this.prueba1.setBounds(260, 20, 141, 171);
                this.prueba1.addMouseListener(this);
                this.prueba1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon isThislove = new ImageIcon(
                                new ImageIcon("DB/Portada/isThislove.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba2 = new JLabel(isThislove);
                this.prueba2.setBounds(512, 20, 141, 171);
                this.prueba2.addMouseListener(this);
                this.prueba2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon LastLast = new ImageIcon(
                                new ImageIcon("DB/Portada/LastLast.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba4 = new JLabel(LastLast);
                this.prueba4.setBounds(20, 220, 141, 171);
                this.prueba4.addMouseListener(this);
                this.prueba4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon lonely = new ImageIcon(
                                new ImageIcon("DB/Portada/lonely.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba5 = new JLabel(lonely);
                this.prueba5.setBounds(260, 220, 141, 171);
                this.prueba5.addMouseListener(this);
                this.prueba5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon loveinthedark = new ImageIcon(
                                new ImageIcon("DB/Portada/loveinthedark.png").getImage().getScaledInstance(141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba6 = new JLabel(loveinthedark);
                this.prueba6.setBounds(512, 220, 141, 171);
                this.prueba6.addMouseListener(this);
                this.prueba6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon MyDearMelancholy = new ImageIcon(
                                new ImageIcon("DB/Portada/MyDearMelancholy.png").getImage().getScaledInstance(
                                                141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba7 = new JLabel(MyDearMelancholy);
                this.prueba7.setBounds(20, 420, 141, 171);
                this.prueba7.addMouseListener(this);
                this.prueba7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon OneLove = new ImageIcon(
                                new ImageIcon("DB/Portada/OneLove.png").getImage().getScaledInstance(141, 171,
                                                Image.SCALE_DEFAULT));

                this.prueba8 = new JLabel(OneLove);
                this.prueba8.setBounds(260, 420, 141, 171);
                this.prueba8.addMouseListener(this);
                this.prueba8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon RealLife = new ImageIcon(
                                new ImageIcon("DB/Portada/RealLife.png").getImage().getScaledInstance(141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba9 = new JLabel(RealLife);
                this.prueba9.setBounds(512, 420, 141, 171);
                this.prueba9.addMouseListener(this);
                this.prueba9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon StillOverit = new ImageIcon(
                                new ImageIcon("DB/Portada/StillOverit.png").getImage().getScaledInstance(141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba10 = new JLabel(StillOverit);
                this.prueba10.setBounds(20, 620, 141, 171);
                this.prueba10.addMouseListener(this);
                this.prueba10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon tillIcollapse = new ImageIcon(
                                new ImageIcon("DB/Portada/tillIcollapse.png").getImage().getScaledInstance(141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba11 = new JLabel(tillIcollapse);
                this.prueba11.setBounds(260, 620, 141, 171);
                this.prueba11.addMouseListener(this);
                this.prueba11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon toogoodatgoodbyes = new ImageIcon(
                                new ImageIcon("DB/Portada/toogoodatgoodbyes.png").getImage().getScaledInstance(
                                                141,
                                                171,
                                                Image.SCALE_DEFAULT));

                this.prueba12 = new JLabel(toogoodatgoodbyes);
                this.prueba12.setBounds(512, 620, 141, 171);
                this.prueba12.addMouseListener(this);
                this.prueba12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba13 = new JLabel(allofme);
                this.prueba13.addMouseListener(this);
                this.prueba13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba14 = new JLabel(doingitWrong);
                this.prueba14.addMouseListener(this);
                this.prueba14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba15 = new JLabel(isThislove);
                this.prueba15.addMouseListener(this);
                this.prueba15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba17 = new JLabel(LastLast);
                this.prueba17.addMouseListener(this);
                this.prueba17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba18 = new JLabel(lonely);
                this.prueba18.addMouseListener(this);
                this.prueba18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba19 = new JLabel(loveinthedark);
                this.prueba19.addMouseListener(this);
                this.prueba19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba20 = new JLabel(MyDearMelancholy);
                this.prueba20.addMouseListener(this);
                this.prueba20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba21 = new JLabel(OneLove);
                this.prueba21.addMouseListener(this);
                this.prueba21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba22 = new JLabel(RealLife);
                this.prueba22.addMouseListener(this);
                this.prueba22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba23 = new JLabel(StillOverit);
                this.prueba23.addMouseListener(this);
                this.prueba23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba24 = new JLabel(tillIcollapse);
                this.prueba24.addMouseListener(this);
                this.prueba24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                this.prueba25 = new JLabel(toogoodatgoodbyes);
                this.prueba25.addMouseListener(this);
                this.prueba25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                // Scroll panel
                this.panel_1 = new JPanel();
                this.scroll = new JScrollPane(this.panel_1);
                this.scroll.setBounds(200, 320, 700, 400);
                this.scroll.setPreferredSize(new Dimension(400, 400));
                this.scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                JScrollBar vertical = scroll.getVerticalScrollBar();
                vertical.setValue(vertical.getMaximum());
                this.panel_1.setPreferredSize(new Dimension(680, 1000));
                this.panel_1.setBackground(new Color(0x0B0633));
                this.panel_1.setLayout(null);

                // linea de reproducciond e cancion
                ImageIcon lineam = new ImageIcon("iconos/linea.png");
                JLabel linea = new JLabel(lineam);
                linea.setBounds(14, 10, 1100, 100);

                // iconos de debajo de la linea de reproducción

                ImageIcon salir = new ImageIcon(new ImageIcon("iconos/out.png").getImage()
                                .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
                this.out = new JLabel(salir);
                this.out.setBounds(1050, 20, 24, 24);
                this.out.addMouseListener(this);
                this.out.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                ImageIcon aleatorio = new ImageIcon(new ImageIcon("iconos/aleatorio.png").getImage()
                                .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
                JLabel aleatorios = new JLabel(aleatorio);
                aleatorios.setBounds(335, 80, 24, 24);

                ImageIcon anteriors = new ImageIcon(
                                new ImageIcon("iconos/anterior.png").getImage().getScaledInstance(24, 24,
                                                Image.SCALE_DEFAULT));
                JLabel anterior = new JLabel(anteriors);
                anterior.setBounds(450, 80, 24, 24);

                ImageIcon siguiente = new ImageIcon(new ImageIcon("iconos/siguiente.png").getImage()
                                .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
                JLabel siguientes = new JLabel(siguiente);
                siguientes.setBounds(660, 80, 24, 24);

                ImageIcon bucle = new ImageIcon(
                                new ImageIcon("iconos/bucle.png").getImage().getScaledInstance(24, 24,
                                                Image.SCALE_DEFAULT));
                JLabel bucles = new JLabel(bucle);
                bucles.setBounds(770, 80, 24, 24);

                ImageIcon play = new ImageIcon(
                                new ImageIcon("iconos/play.png").getImage().getScaledInstance(24, 24,
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
                                new ImageIcon("Photos/sinlema.png").getImage().getScaledInstance(350, 103,
                                                Image.SCALE_DEFAULT));
                ImageIcon icono = new ImageIcon("Photos/icono.png");
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

                String[] musica = { " ", "R&B", "Torch ballad", "Reggae", "Soul", "Electronic", "Hip Hop",
                                "Orchestral Pop", "Afrobeat" };// Opciones
                // que se
                // podrán
                // escoger
                // para
                // filtra
                // las canciones o albumes
                // DEsplegable
                this.desplegable = new JComboBox(musica); // Crear Desplegable
                this.desplegable.setBounds(920, 280, 110, 20);
                this.desplegable.addActionListener(this);

                this.setVisible(true);
                this.setTitle("Musically"); // titiulo aplicación
                this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
                this.setSize(1114, 960); // dimensiones de la aplicación
                this.setLayout(null);
                this.setResizable(false); // para que no se pueda modificar las dimensiones
                this.setDefaultCloseOperation(Principal.EXIT_ON_CLOSE);// Para que se cierre el programa al darle a la X

                this.add(desplegable);
                this.add(scroll);
                this.add(panel);
                this.add(f_principal);
                this.add(label);
                this.add(out);
                this.setVisible(true); // Para que se aquello de la ventana
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == this.desplegable) {
                        JComboBox cb = (JComboBox) e.getSource();
                        String seleccion = (String) cb.getSelectedItem();

                        switch (seleccion) {
                                case " ":
                                        this.panel.removeAll();
                                        this.panel_1.add(prueba);
                                        this.panel_1.add(prueba1);
                                        this.panel_1.add(prueba2);
                                        this.panel_1.add(prueba4);
                                        this.panel_1.add(prueba5);
                                        this.panel_1.add(prueba6);
                                        this.panel_1.add(prueba7);
                                        this.panel_1.add(prueba8);
                                        this.panel_1.add(prueba9);
                                        this.panel_1.add(prueba10);
                                        this.panel_1.add(prueba11);
                                        this.panel_1.add(prueba12);

                                        break;
                                case "R&B":
                                        this.panel_1.removeAll();

                                        this.prueba18.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba18);

                                        this.prueba20.setBounds(260, 20, 141, 171);
                                        this.panel_1.add(prueba20);

                                        this.prueba23.setBounds(512, 20, 141, 171);
                                        this.panel_1.add(prueba23);

                                        break;

                                case "Torch ballad":
                                        this.panel_1.removeAll();
                                        this.prueba19.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba19);

                                        break;

                                case "Reggae":
                                        this.panel_1.removeAll();
                                        this.prueba15.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba15);

                                        break;

                                case "Soul":
                                        this.panel_1.removeAll();

                                        this.prueba13.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba13);

                                        this.prueba14.setBounds(260, 20, 141, 171);
                                        this.panel_1.add(prueba14);

                                        this.prueba22.setBounds(512, 20, 141, 171);
                                        this.panel_1.add(prueba22);

                                        break;

                                case "Electronic":
                                        this.panel_1.removeAll();

                                        this.prueba21.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba21);

                                        break;

                                case "Hip Hop":
                                        this.panel_1.removeAll();

                                        this.prueba24.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba24);
                                        break;

                                case "Orchestral Pop":
                                        this.panel_1.removeAll();

                                        this.prueba25.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba25);

                                        break;
                                case "Afrobeat":
                                        this.panel_1.removeAll();
                                        this.prueba17.setBounds(20, 20, 141, 171);
                                        this.panel_1.add(prueba17);
                                        break;
                                default:

                                        break;

                        }
                }

        }

        @Override
        public void mouseClicked(MouseEvent e) {
                if (e.getSource() == this.prueba | e.getSource() == prueba13) {
                        this.setVisible(false);
                        try {
                                new Music("All of me");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba1 | e.getSource() == prueba14) {
                        try {
                                this.setVisible(false);
                                new Music("Doing it Wrong");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba2 | e.getSource() == prueba15) {
                        try {
                                this.setVisible(false);
                                new Music("is This Love?");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }

                if (e.getSource() == this.prueba4 | e.getSource() == prueba17) {

                        try {
                                this.setVisible(false);
                                new Music("Last Last");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba5 | e.getSource() == prueba18) {
                        try {
                                this.setVisible(false);
                                new Music("Lonely");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba6 | e.getSource() == prueba19) {

                        try {
                                this.setVisible(false);
                                new Music("Love in the Dark");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba7 | e.getSource() == prueba20) {

                        try {
                                this.setVisible(false);
                                new Album("My Dear Melancholy");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba8 | e.getSource() == prueba21) {
                        try {
                                this.setVisible(false);
                                new Album("One Love");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba9 | e.getSource() == prueba22) {
                        try {
                                this.setVisible(false);
                                new Music("Real Life");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba10 | e.getSource() == prueba23) {
                        try {
                                this.setVisible(false);
                                new Album("Still Over It");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba11 | e.getSource() == prueba24) {
                        try {
                                this.setVisible(false);
                                new Music("Till I Collapse");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.prueba12 | e.getSource() == prueba25) {
                        try {
                                this.setVisible(false);
                                new Music("Too Good at Goodbyes");
                        } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }
                if (e.getSource() == this.out) {
                        Conexion.closeConn();
                        System.exit(1);

                }
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
}