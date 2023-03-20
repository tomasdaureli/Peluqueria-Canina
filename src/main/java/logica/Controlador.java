package logica;

import persistencia.ControladorPersistencia;

public class Controlador {

    ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void guardar(String nombre, String raza, String color, String nombreDuenio, String contacto, String observaciones, String alergico, String atEsp) {
        
        // Creamos objetos dueño y mascota
        Duenio duenio = new Duenio();
        Mascota masco = new Mascota();

        // Asignamos los datos del dueño al objeto
        duenio.setNombre(nombreDuenio);
        duenio.setContacto(contacto);

        // Asignamos los datos de la mascota al objeto
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atEsp);
        masco.setUnDuenio(duenio);

        controlPersis.guardar(duenio, masco);
        
    }

    
    
}
