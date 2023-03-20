package logica;

public class Mascota {
    
    private int id;
    private String nombre, raza, color, observaciones;
    private boolean alergico;
    private boolean atencion_especial;
    private Duenio unDuenio;
    
    public Mascota() {
    }

    public Mascota(int id, String nombre, String raza, String color, String observaciones, boolean alergico,
            boolean atencion_especial, Duenio unDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.unDuenio = unDuenio;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    
    
}
