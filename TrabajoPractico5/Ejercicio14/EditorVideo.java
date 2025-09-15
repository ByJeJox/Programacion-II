package TrabajoPractico5.Ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duracion: " + render.getProyecto().getDuracionMin() + " minutos");
        System.out.println("Formato: " + render.getFormato());
    }

}
