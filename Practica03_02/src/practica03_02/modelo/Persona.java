package practica03_02.modelo;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private Casa casa;

    public Persona(int id, String nombre, String apellido, Casa casa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
    }

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre y apellido =" + nombre + " " + apellido + ", casa=" + casa + '}';
    }

}
