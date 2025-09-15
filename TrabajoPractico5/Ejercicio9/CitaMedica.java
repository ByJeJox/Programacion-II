package TrabajoPractico5.Ejercicio9;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void mostrarCitaMedica() {
        System.out.println("Cita Medica:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNombre() + ", Obra Social: " + paciente.getObraSocial());
        } else {
            System.out.println("Paciente: No asignado");
        }
        if (profesional != null) {
            System.out.println("Profesional: " + profesional.getNombre() + ", Especialidad: " + profesional.getEspecialidad());
        } else {
            System.out.println("Profesional: No asignado");
        }
    }
}
