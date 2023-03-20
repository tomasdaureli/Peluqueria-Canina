package logica;

public class Duenio {
    
    private int id_duenio;
    private String nombre, contacto;
    
    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String contacto) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    
}
