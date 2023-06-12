import com.mysql.cj.jdbc.Blob;

public class Portada {
    private String id_album;
    private String id_cancion;
    private String genero;
    private Blob portada;

    public Portada(){
        this.id_cancion= id_cancion;
        this.id_album = id_album;
        this.genero = genero;
        this.portada = portada;
    }
    
}
