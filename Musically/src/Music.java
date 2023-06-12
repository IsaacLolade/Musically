import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputListener;

public class Music extends JFrame implements MouseInputListener, ActionListener {
    private String song;
    private String artista;
    private String genero;
    private String descripcion;
    private Blob portada;
    private JLabel casa;
    private JLabel f_principal;
    private JPanel p;
    private JLabel nombre_artista;
    private JLabel nombre_album;
    private JLabel nombre_genero;
    private JLabel nombre_descripcion;
    private JLabel nombre_artista2;
    private JLabel nombre_album2;
    private JLabel nombre_genero2;
    private JTextArea descripcion2;
    private JButton player;

    public Music(String id_cancion) throws SQLException, IOException {
        ArrayList<Object> song = Querys.returnMusicInfoFromId(id_cancion);
        this.artista = song.get(0).toString();
        this.genero = song.get(1).toString();
        this.descripcion = song.get(2).toString();
        this.portada = (Blob) song.get(3);
        this.song = id_cancion;

        ImageIcon home = new ImageIcon(new ImageIcon("iconos/HOME.png").getImage()
        .getScaledInstance(24, 24, Image.SCALE_DEFAULT));
       this.casa = new JLabel(home);
       this.casa.setBounds(970, 20, 24, 24);
       this.casa.addMouseListener(this);
       this.casa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ImageIcon closeIcon = new ImageIcon(
                new ImageIcon("Photos/conlema.png").getImage().getScaledInstance(350, 103, Image.SCALE_DEFAULT));

        this.f_principal = new JLabel(closeIcon, JLabel.CENTER);
        this.f_principal.setBounds(270, 50, 462, 103);
        this.p = new JPanel();
        this.p.setBounds(100, 200, 341, 468);
        InputStream in = portada.getBinaryStream(); // Luego lo convertimos a a binario
        BufferedImage imagen = ImageIO.read(in);
        ImageIcon icon = new ImageIcon(imagen);
        JLabel imgen = new JLabel(icon);
        imgen.setBounds(0, 0, p.getWidth(), p.getHeight());
        this.p.setLayout(null);
        this.p.add(imgen);
        this.p.setBackground(Color.white);

        ImageIcon icono = new ImageIcon("Photos/icono.png");
        this.setIconImage(icono.getImage());// cambiar icono de ventana

        this.nombre_album = new JLabel("Canción :", JLabel.CENTER);
        this.nombre_album.setBounds(540, 220, 150, 20);
        this.nombre_album.setFont((new Font("Montserrat", Font.BOLD, 20)));
        this.nombre_album.setForeground(Color.WHITE);

        this.nombre_album2 = new JLabel(id_cancion, JLabel.RIGHT);
        this.nombre_album2.setBounds(620, 220, 150, 20);
        this.nombre_album2.setForeground(Color.WHITE);

        this.nombre_artista = new JLabel("Artista :", JLabel.CENTER);
        this.nombre_artista.setBounds(540, 300, 150, 20);
        this.nombre_artista.setFont((new Font("Montserrat", Font.BOLD, 20)));
        this.nombre_artista.setForeground(Color.WHITE);

        this.nombre_artista2 = new JLabel(artista, JLabel.CENTER);
        this.nombre_artista2.setBounds(620, 300, 150, 20);
        this.nombre_artista2.setForeground(Color.WHITE);

        this.nombre_genero = new JLabel("Genero :", JLabel.CENTER);
        this.nombre_genero.setBounds(538, 380, 150, 20);
        this.nombre_genero.setFont(new Font("Montserrat", Font.BOLD, 20));
        this.nombre_genero.setForeground(Color.WHITE);

        this.nombre_genero2 = new JLabel(genero, JLabel.CENTER);
        this.nombre_genero2.setBounds(620, 380, 150, 20);
        this.nombre_genero2.setForeground(Color.WHITE);

        this.nombre_descripcion = new JLabel("Descripción :", JLabel.CENTER);
        this.nombre_descripcion.setBounds(520, 440, 150, 20);
        this.nombre_descripcion.setFont(new Font("Montserrat", Font.BOLD, 20));
        this.nombre_descripcion.setForeground(Color.WHITE);

        this.descripcion2 = new JTextArea(descripcion);
        this.descripcion2.setBounds(530, 480, 450, 150);
        this.descripcion2.setFont(new Font("Montserrat", Font.BOLD, 12));
        this.descripcion2.setForeground(Color.WHITE);
        this.descripcion2.setTabSize(20);
        this.descripcion2.setLineWrap(true);
        this.descripcion2.setWrapStyleWord(true);
        this.descripcion2.setEditable(false);
        this.descripcion2.setBackground(new Color(0x0B0633));

        this.player = new JButton("►");
        this.player.addActionListener(this);
        this.player.setBounds(720,620,50,50);
        this.player.setFocusable(false);
        this.player.setFont(new Font("Montserrat", Font.BOLD, 20));
        this.player.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle(id_cancion);
        this.setSize(1024, 775);
        this.getContentPane().setBackground(new Color(0x0B0633)); // fondo aplicado
        this.setLayout(null);
        this.add(f_principal);
        this.add(p);
        this.add(nombre_artista);
        this.add(nombre_album);
        this.add(nombre_genero);
        this.add(casa);
        this.add(nombre_descripcion);
        this.add(nombre_artista2);
        this.add(nombre_genero2);
        this.add(nombre_album2);
        this.add(descripcion2);
        this.add(player);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    
      
            
          }
        
 

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.casa){
            new Principal();
            this.setVisible(false);
            
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

    @Override
    public void mouseDragged(MouseEvent e) {
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.player){
            if(this.song.equals("All of me")){
                try{
                    File file = new File("musica/allofme.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }if (this.song.equals("Doing it Wrong")){
                
                try{
                    File file = new File("musica/doingitwrong.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }if (this.song.equals("is This Love?")){
                try{
                    File file = new File("musica/isthislove.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }if (this.song.equals("Last Last")){
                try{
                    File file = new File("musica/lastlast.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }if (this.song.equals("Lonely")){
                try{
                    File file = new File("musica/lonely.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }if (this.song.equals("Love in the Dark")){
                try{
                    File file = new File("musica/loveinthedark.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }if (this.song.equals("Real Life")){
                try{
                File file = new File("musica/reallife.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                while (!clip.isRunning())
                    Thread.sleep(10);
                while (clip.isRunning())
                    Thread.sleep(10);
    
               clip.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
                
            
                
            }if (this.song.equals("Till I Collapse")){
                try{
                    File file = new File("musica/tillicollapse.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }if (this.song.equals("Too Good at Goodbyes")){
                try{
                    File file = new File("musica/togoodatgoodbyes.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                    while (!clip.isRunning())
                        Thread.sleep(10);
                    while (clip.isRunning())
                        Thread.sleep(10);
        
                   clip.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            

        }
      
    }

}