package logica;

import java.util.List;

import persistencia.ControladorPersistencia;
import persistencia.exceptions.NonexistentEntityException;

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

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) throws NonexistentEntityException {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombre, String raza, String color, String nomDuenio,
            String contacto, String observaciones, String alergico, String atEsp) {
        
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atEsp);
        masco.setAlergico(alergico);

        controlPersis.modificarMascota(masco);

        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        duenio.setNombre(nomDuenio);
        duenio.setContacto(contacto);

        this.modificarDuenio(duenio);

    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    
    
}
