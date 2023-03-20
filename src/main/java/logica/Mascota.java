package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre, raza, color, observaciones;
    private String alergico;
    private String atencion_especial;
    private Duenio unDuenio;
    
    public Mascota() {
    }

    public Mascota(int id, String nombre, String raza, String color, String observaciones, String alergico,
            String atencion_especial, Duenio unDuenio) {
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

    public String isAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    
    
}
