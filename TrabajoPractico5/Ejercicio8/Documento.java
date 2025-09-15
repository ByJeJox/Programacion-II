package TrabajoPractico5.Ejercicio8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    private Usuario1 usuario;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario1 usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha);
        this.usuario = usuario;
    }

    public void mostrarDocumento() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firmado por: " + usuario.getNombre() + " (" + usuario.getEmail() + ")");
        System.out.println("Código Hash: " + firma.getCodigoHash());
        System.out.println("Fecha de Firma: " + firma.getFecha());
    }
}
