package ec.edu.intsuperior.modelo;

public class Persona {

    String cedula;
    String nombre;
    String apellido;
    String direccion;

    public enum TipoGenero {
        MASCULINO, FEMENINO
    }
    TipoGenero genero;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, TipoGenero genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;

    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoGenero getGenero() {
        return genero;
    }
}
