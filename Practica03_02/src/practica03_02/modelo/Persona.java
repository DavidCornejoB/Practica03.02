package practica03_02.modelo;

public class Persona {
    private int id;
    private String nomApe;
    private Casa casa;

    public Persona(int id, String nomApe, Casa casa) {
        this.id = id;
        this.nomApe = nomApe;
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nomApe=" + nomApe + ", casa=" + casa + '}';
    }
    
}
