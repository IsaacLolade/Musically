public class Music {
    private int id;
    private static String id_cancion;
    private String artist;
    private String genero;
    private String duracion;
    private String descripcion;
    private String url;
    private String blob;

    public Music(int id, String id_cancion) {
        this.id = id;
        this.id_cancion = id_cancion;
    }

    public static void main(String[] args) {
        Music m = new Music(0, "All of me");
        Music m1 = new Music(1, "Doing it Wrong");
        Music m2 = new Music(2, "is This Love?");
        Music m3 = new Music(3, "Last Last");
        Music m4 = new Music(4, "Lonely");
        Music m5 = new Music(5, "Love in the Dark");
        Music m6 = new Music(6, "Real Life");
        Music m7 = new Music(7, "Till I Collapse");
        Music m8 = new Music(8, "Too Good at Goodbyes");
        Music m9 = new Music(9, "Under The Influence");
        Music m10 = new Music(10, "Viendo el techo");
        Music m11 = new Music(11, "Waka Waka");

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(String id_cancion) {
        Music.id_cancion = id_cancion;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBlob() {
        return this.blob;
    }

    public void setBlob(String blob) {
        this.blob = blob;
    }

}
