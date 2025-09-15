package TrabajoPractico5.Ejercicio13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("QR generado para : " + codigoQR.getUsuario().getNombre());
        System.out.println("Contenido : " + codigoQR.getValor());
        
    }

}
